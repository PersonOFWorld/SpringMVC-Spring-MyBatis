package com.demo.common;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Random;

/**
 * Created by One on 2016/5/3.
 */
public class GetPicture {
    // 图片的宽度。
    private int width = 160;
    // 图片的高度。
    private int height = 40;
    // 验证码字符个数
    private int codeCount = 4;
    private String strRand;
    // 验证码
    private static String code = null;
    // 验证码图片Buffer
    private BufferedImage buffImg=null;

    public  GetPicture(int width,int height,int codeCount,String strRand) {
        this.width=width;
        this.height=height;
        this.codeCount=codeCount;
        this.strRand=strRand;
        this.createCode();
    }
    public void createCode() {

        Random random = new Random();
        // 图像buffer
        buffImg = new BufferedImage(width, height,BufferedImage.TYPE_INT_RGB);
        Graphics2D g = buffImg.createGraphics();
        //字体库
        String []types={"华文行楷","宋体","微软雅黑"};
        int number=random.nextInt(types.length);
        //图片背景色
        int red = random.nextInt(255);
        int green = random.nextInt(255);
        int blue = random.nextInt(255);
        g.setColor(new Color(red, green, blue));
        g.fillRect(0, 0, width, height);
        char []temp= strRand.toCharArray();
        //字体大小设置
        int size=40;
        //字体设置
        g.setFont(new Font(types[number],Font.BOLD,size));
        StringBuffer randomCode = new StringBuffer();
        int x,y;
        int line=1;
        int j=0;
        codeCount=temp.length;
        // 文字写入到图片。
        for (int i = 0; i < codeCount; i++) {
            //设置字体颜色;
            g.setColor(Color.WHITE);
            //设置每一个字的位置
            x=size*j+8;
            //判断是否要要换行
            if((x+size)>=width) {
                line += 1;
                j=0;
                x=size*j;
            }
            //记录当前是第几个字符
            j++;
            //字的高度，从上开始计算
            y=size*line;
            g.drawString(String.valueOf(temp[i]), x, y);
            randomCode.append(strRand);
        }
        // 将四位数字的验证码保存到Session中。
        code = randomCode.toString();
    }
    public void write(OutputStream sos) throws IOException {
        ImageIO.write(buffImg, "png", sos);
        sos.close();
    }
    public static String getCode() {
        return code;
    }

}
