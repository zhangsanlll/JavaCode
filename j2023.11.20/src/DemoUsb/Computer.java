package DemoUsb;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: lenovo
 * Date: 2023-11-20
 * Time: 22:27
 */
public class Computer {
    //使用电脑需要先开机再确认是用键盘还是鼠标。
    //但鼠标或者键盘都有属于自己的类，此时需要强转成子类
    //两个普通方法
    public void poweron(){
        System.out.println("打开电脑");
    }

    public void poweroff(){
        System.out.println("关闭电脑");
    }

    //使用usb设备
    public void useDevice(USB usb){
        //调用自己的方法
        usb.openDevice();

        if(usb instanceof KeyBoard){
            //强转成子类调用自己的普通方法
            KeyBoard keyboard = (KeyBoard)usb;
            keyboard.input();
        }else if(usb instanceof Mouse){
            //强转成子类调用自己的普通方法
            Mouse mouse = (Mouse)usb;
            mouse.click();
        }
        usb.closeDevice();
    }
}
