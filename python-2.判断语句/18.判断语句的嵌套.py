if int(input("请输入你的身高（cm）："))>120:
    print('身高超出限制，不可以免费。')
    print('但是，如果VIP级大于3，可以免费')
    if int(input("请输入你的VIP等级（1-5）："))>3:
        print('vip等级达标，可以免费')
    else:
        print('Sprry,你需要买票10元')

else:
    print('欢迎小朋友！免费游玩')