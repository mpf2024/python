from pyecharts.charts import Map
from pyecharts.charts import Line
from pyecharts.options import VisualMapOpts
# 准备地图对象
map = Map()
line=Line()
line.add_xaxis(["北京","上海","湖南","台湾","广东"])
line.add_yaxis("测试地图",[99,199,299,399,499])
line.render()
# 准备数据
data = [
    ('北京',99),
    ('上海',199),
    ('湖南',299),
    ('台湾',399),
    ('广东',499)
]
# 添加数据
map.add("测试地图",data,"china")

# 设置全局选项
map.set_global_opts(
    # 视觉显示器
    visualmap_opts=VisualMapOpts(
        is_show=True,
        # 手动设置分段
        is_piecewise=True,
        pieces=[
            {"min":1,"max":9,"label":"1-9","color":"#CCFFFF"},
            {"min":10,"max":99,"label":"10-99","color":"#FFFF99"},
            {"min":100,"max":499,"label":"99-499","color":"#FF9966"},
            {"min":500,"max":999,"label":"499-999","color":"#FF6666"}
        ]

                                 )
)

# 绘制地图
map.render()