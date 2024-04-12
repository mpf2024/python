'''

'''
# 导包
from pyecharts.charts import Line
from pyecharts.options import TitleOpts,LegendOpts,ToolboxOpts,VisualMapOpts
# 创建一个折线图对象
line = Line()
# 给折线图对象添加x轴的数据
line.add_xaxis(["中国","美国","日本"])
# 给折线图对象添加y轴的数据
line.add_yaxis("GDP",[30,20,10])

#设置全局配置项
line.set_global_opts(
    # pos_left="center"靠近最左侧居中，pos_bottom="1%"靠近底部百分之一
    title_opts=TitleOpts(title="GDP展示", pos_left="center",pos_bottom="1%" ),
    # 图例
    legend_opts=LegendOpts(is_show=True),
    # 工具箱
    toolbox_opts=ToolboxOpts(is_show=True),
    # 视觉映射
    visualmap_opts=VisualMapOpts(is_show=True)

)
# 通过render方法。将代码生成为图像
line.render()