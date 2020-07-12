package myutil.testgui.ExamSystem.util;

import javax.swing.*;

/**
 * @author LiWei
 * @date 2020/06/13 16:28
 */

public abstract class BaseFrame extends JFrame {

    // 模板模式
    // 设计一个规则，因为任何窗口想要画出来，执行流程固定

    public BaseFrame() {
    }

    public BaseFrame(String title) {
        super(title);
    }

    protected void init() {
        this.configComponents();
        this.addElement();
        this.addListener();
        this.setFrameSelf();
    }

    // 设置每一个组件的位置、大小、布局等
    protected abstract void configComponents();

    // 将所有的组件添加在窗体上
    protected abstract void addElement();

    // 绑定事件监听
    protected abstract void addListener();

    // 设置窗体规格
    protected abstract void setFrameSelf();

}
