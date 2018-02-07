$(function () {
    // 获取userId
    // alert("ban");
    var userId = getCookie("userId");
    if (userId != null) {
        $.ajax({
            url: "message/getMessage.do",
            type: "post",
            data: {
                "userId": userId
            },
            dataType: "json",
            success: function (result) {
                if (result.code == "10000") {
                    // alert(result.message);
                    // 获取数据加载到消息界面
                    $("#message_count").text(result.result.length);
                    var ul = $("#message_detail_ul");
                    ul.html("");
                    var sli = "";
                    for (var i = 0; i < result.result.length; i++) {
                        var messageId = result.result[i].coolMessageId;
                        var messageDetail = result.result[i].coolMessageDetail;
                        var apply_userId = result.result[i].coolUserId;
                        var companyId = result.result[i].coolCompanyId;
                        var createTime = result.result[i].coolMessageCreateTime;
                        var messageNick = result.result[i].user.coolUserNick;
                        sli = '<li id="message_detail_li" data-toggle="modal" data-target="#getMessageDetail">'
                            + '<a class="notification-item">'
                            + '<span class="dot bg-success"></span>'
                            + messageDetail + '&nbsp&nbsp(&nbsp' + messageNick + '&nbsp)' + '</a></li>';
                        sli = $(sli);
                        sli.data('messageNick', messageNick);
                        sli.data('messageId', messageId);
                        sli.data('messageDetail', messageDetail);
                        sli.data('companyId', companyId);
                        sli.data('apply_userId', apply_userId);
                        sli.data('createTime', createTime);

                        ul.append(sli);
                    }

                } else {
                    //alert(result.message);
                    // 弹窗消失
                }
            },
            error: function () {
                // console.log("aaaa")
                alert("用户信息加载失败，请重试");
            }
        });
    }
});

$(function () {
    $("#message_detail_ul").on("click", "#message_detail_li", function () {
        var li = $(this);
        var messageId = li.data('messageId');
        var companyId = li.data('companyId');
        var messageDetail = li.data('messageDetail');
        var apply_userId = li.data('apply_userId');
        var createTime = li.data('createTime');
        var messageNick = li.data('messageNick');
        // alert(messageId+","+companyId+","+apply_userId+","+createTime);
        $("#message_user").text(messageNick);
        $("#message_time").text(getMessageTimer(createTime));
        $("#message_label").text(messageDetail);
        sendApplySuccess(messageId, companyId, apply_userId);

    });

});

/**
 * 格式化时间
 *
 * @param rfidOrderCreateTime
 */
function getMessageTimer(createTime) {
    var d = new Date(createTime);
    return d.getFullYear() + "年" + (d.getMonth() + 1) + "月" + d.getDate() + "日"
        + d.getHours() + ":" + d.getMinutes() + ":" + d.getSeconds();
}

function sendApplySuccess(messageId, companyId, apply_userId) {
    $("#send_message_btn").click(function () {
//		alert("sss");
        $.ajax({
            url: "message/sendApplyMessage.do",
            type: "post",
            data: {
                "messageId": messageId,
                "companyId": companyId,
                "apply_userId": apply_userId,
            },
            dataType: "json",
            success: function (result) {
                alert(result.message);
                $("#send_message_close").click();
                window.location.reload();
            },
            error: function () {
                alert("用户信息加载失败，请重试");
                $("#send_message_close").click();
            }
        });


    });

}
