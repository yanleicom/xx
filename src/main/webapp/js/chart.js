nanoption = {
    color:['#eec330', '#00b8ea','#ea0048','#bb00ea','#75d458'],
    series : [
        {
            name: '实有人口',
            type: 'pie',
            radius: '50%',
            data:[
                {value:235, name:'类型一'},
                {value:274, name:'类型二'},
            ]
        }
    ]
};
peioption = {
    color:['#eec330', '#00b8ea','#ea0048','#bb00ea','#75d458'],
    title : {
        text: '分类型事件数',
        textStyle: {
            fontWeight: 'normal',              //标题颜色
            color: '#fff'
          }
    },
    series : [
        {
            name: '类型',
            type: 'pie',
            radius: '50%',
            data:[
                {value:5, name:'类型一'},
                {value:74, name:'类型二'},
                {value:31, name:'类型三'},
                {value:35, name:'类型四'},
                {value:13, name:'类型五'}
            ]
        }
    ]
};
baroption={
    title : {
        text: '分部门事件数',
        textStyle: {
            fontWeight: 'normal',        
            color: '#fff'
          },
          padding:[5,0,0,5]
    },
    grid: {
        left: '5%',
        right: '4%',
        bottom: '3%',
        containLabel: true,
        x:30
    },
    tooltip : {
        trigger: 'axis'
    },
    calculable : true,
    xAxis : [
        {
            type : 'category', 
            data : ['部1','部2','部3','部4','部5','部6','部7','部8'],
            axisLabel: {
                show: true,
                textStyle: {
                    color: '#fff'
                }
            },
            axisLine: {
                lineStyle: {
                    type: 'solid',
                    color: '#fff',//左边线的颜色
                    width:'1'//坐标线的宽度
                }
            },
        }
    ],
    yAxis : [
        {
            type : 'value',
            axisLabel : {
                formatter: '{value}',
                textStyle: {
                    color: '#fff'
                }
            },
            axisLine: {
                lineStyle: {
                    type: 'solid',
                    color: '#fff',//左边线的颜色
                    width:'1'//坐标线的宽度
                }
            },
        }
    ],
    series : [
        {
            name:'数量',
            type:'bar',
            data:[ 10,20,15,37,51,18,34,27],
            itemStyle:{  normal:{
                color:'#00b8ea',

            }}  
        }
    ]
}

mapoption={
    backgroundColor: '#180c54',
    color: ['gold','aqua','lime'],
    title: {
        text: '实有房屋地址',
        padding: [20,40,20,40],
        x:'left',
        textStyle : {
            color: '#fff'
        }
    },
    legend: {
        orient: 'vertical',
        data:['商用房屋','民用住宅'],
        padding: [60,10,20,40] ,
        x:'left',
        textStyle : {
            color: '#fff'
        }
    },
    dataRange: {
        min: 0,
        max: 1000,
        color:['#ffd700','#00ffff'],
        text:['高','低'],           // 文本，默认为数值文本
        calculable : true,
        textStyle:{
            color:'#fff'
        },
        padding: [60,10,20,40] ,
    },
    tooltip: {
        show: true,  
        backgroundColor: 'rgba(0,0,0,0.5)', 
    },
    series: [
        {
            name:'商用房屋',
            type: 'map',
            map: 'xiacheng',
            itemStyle:{  
                // 默认状态下地图的文字  
                normal:{label:{show:true}},  
                // 鼠标放到地图上面显示文字  
                emphasis:{label:{show:true}}  
            },
            data:[  
                {name: '潮鸣',value: Math.round(Math.random()*1000)},  
                {name: '长庆',value: Math.round(Math.random()*1000)},
                {name: '武林',value: Math.round(Math.random()*1000)},
                {name: '天水',value: Math.round(Math.random()*1000)},
                {name: '朝晖',value: Math.round(Math.random()*1000)},
                {name: '文晖',value: Math.round(Math.random()*1000)},
                {name: '东新',value: Math.round(Math.random()*1000)},
                {name: '石桥',value: Math.round(Math.random()*1000)}
            ]  
        },
        {
            name:'民用住宅',
            type: 'map',
            map: 'xiacheng',
            itemStyle:{  
                // 默认状态下地图的文字  
                normal:{label:{show:true}},  
                // 鼠标放到地图上面显示文字  
                emphasis:{label:{show:true}}  
            },
            data:[  
                {name: '潮鸣',value: Math.round(Math.random()*1000)},  
                {name: '长庆',value: Math.round(Math.random()*1000)},
                {name: '武林',value: Math.round(Math.random()*1000)},
                {name: '天水',value: Math.round(Math.random()*1000)},
                {name: '朝晖',value: Math.round(Math.random()*1000)},
                {name: '文晖',value: Math.round(Math.random()*1000)},
                {name: '东新',value: Math.round(Math.random()*1000)},
                {name: '石桥',value: Math.round(Math.random()*1000)}
            ]  
        },
    ]
}

thioption={
    backgroundColor: '#180c54',
    color: ['gold','aqua','lime'],
    title: {
        text: '事件分布统计',
        padding: [20,40,20,40],
        x:'left',
        textStyle : {
            color: '#fff'
        }
    },
    legend: {
        orient: 'vertical',
        data:['事件'],
        padding: [60,10,20,40] ,
        x:'left',
        textStyle : {
            color: '#fff'
        }
    },
    dataRange: {
        min: 0,
        max: 1000,
        color:['#f56c6c','#409eff'],
        text:['高','低'],           // 文本，默认为数值文本
        calculable : true,
        textStyle:{
            color:'#fff'
        },
        padding: [60,10,20,40] ,
    },
    tooltip: {
        show: true,  
        backgroundColor: 'rgba(0,0,0,0.5)', 
    },
    series: [
        {
            name:'事件',
            type: 'map',
            map: 'xiacheng',
            itemStyle:{  
                // 默认状态下地图的文字  
                normal:{label:{show:true}},  
                // 鼠标放到地图上面显示文字  
                emphasis:{label:{show:true}}  
            },
            data:[  
                {name: '潮鸣',value: Math.round(Math.random()*1000)},  
                {name: '长庆',value: Math.round(Math.random()*1000)},
                {name: '武林',value: Math.round(Math.random()*1000)},
                {name: '天水',value: Math.round(Math.random()*1000)},
                {name: '朝晖',value: Math.round(Math.random()*1000)},
                {name: '文晖',value: Math.round(Math.random()*1000)},
                {name: '东新',value: Math.round(Math.random()*1000)},
                {name: '石桥',value: Math.round(Math.random()*1000)}
            ]  
        },
    ]
}