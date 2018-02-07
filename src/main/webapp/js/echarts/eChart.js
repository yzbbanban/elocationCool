function getEChart(temp, humi, dt, select_startTime, select_endTime) {
    console.log("ssssssss");
    // 基于准备好的dom，初始化echarts实例
    var myChart = echarts.init(document.getElementById('chart'));
//	console.log(temp);
    // 指定图表的配置项和数据
    var option = {
        title: {
            text: '温湿度报表',
            //subtext: '数据来自西安兰特水电测控技术有限公司',
            x: 'center',
            align: 'right'
        },
        grid: {
            bottom: 80
        },
        toolbox: {
            feature: {
                dataZoom: {
                    yAxisIndex: 'none'
                },
                restore: {},
                saveAsImage: {}
            }
        },
        tooltip: {
            trigger: 'axis',
            axisPointer: {
                type: 'cross',
                animation: false,
                label: {
                    backgroundColor: '#505765'
                }
            }
        },
        legend: {
            data: ['温度', '湿度'],
            x: 'left'
        },
//		dataZoom: [{
//				show: true,
//				realtime: true,
//				start: 65,
//				end: 85
//			},
//			{
//				type: 'inside',
//				realtime: true,
//				start: 65,
//				end: 85
//			}
//		],
        xAxis: [{
            type: 'category',
            boundaryGap: false,
            axisLine: {
                onZero: false
            },
            data: dt.map(function (str) {
                return str.replace(' ', '\n')
            })
        }],
        yAxis: [{
            name: '温度(℃)',
            type: 'value',
            max: 100
        },
            {
                name: '湿度(RH%)',
                nameLocation: 'start',
                max: 100,
                type: 'value',
                inverse: true
            }
        ],
        series: [{
            name: '温度',
            type: 'line',
            animation: false,
            areaStyle: {
                normal: {}
            },
            lineStyle: {
                normal: {
                    width: 1
                }
            },
            markArea: {
                silent: true,
                data: [
                    [{
                        xAxis: select_startTime
                    }, {
                        xAxis: select_endTime
                    }]
                ]
            },

            data: temp
        },
            {
                name: '湿度',
                type: 'line',
                yAxisIndex: 1,
                animation: false,
                areaStyle: {
                    normal: {}
                },
                lineStyle: {
                    normal: {
                        width: 1
                    }
                },
                markArea: {
                    silent: true,
                    data: [
                        [{
                            xAxis: select_startTime
                        }, {
                            xAxis: select_endTime
                        }]
                    ]
                },

                data: humi
            }
        ]
    };

    // 使用刚指定的配置项和数据显示图表。
    myChart.setOption(option);
}