'''
演示面向对象：继承的基础语法
'''
# 演示单继承
class Phone:
    IMEI = None            # 序列号
    producer = 'XM'        # 厂商

    def call_by_4g(self):
        print('4g通话')

class Phone2024(Phone):
    face_id = "10001"         # 面部识别ID

    def call_by_5g(self):
        print('2024年新功能：5g通话')

phone = Phone2024()
print(phone.producer)
phone.call_by_4g()
phone.call_by_5g()

# 演示多继承
class NFCReader:
    nfc_type = "第五代"     # 读卡器的类型
    producer = 'XM'        # 厂商

    def read_card(self):
        print('NFC读卡')

    def write_card(self):
        print('NFC写卡')


class RemoteControl:
    rc_type = "红外遥控"

    def control(self):
        print('红外遥控开启了')


class MyPhone(Phone2024,NFCReader,RemoteControl):
    pass  # 继承多个类时，功能比较完善不想添加新功能，可以用pass补全语法， 占位语句


phone = MyPhone()
phone.call_by_4g()
phone.read_card()
phone.write_card()

