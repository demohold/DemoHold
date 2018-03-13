package com.young.desgin.pattern.singleton.demo;

public class DianShi {
    public  void play(DianShiTai dst){
        System.out.println("当前电视播放的电视台是："+dst.getName());
    }

    public static void main(String[] args) {
            DianShi dianShi=new DianShi();
            dianShi.play(CCTV1DianShiTai.getInstance());
            dianShi.play(CCTV2DianShiTai.getInstance());
            dianShi.play(CCTV3DianShiTai.getInstance());
            dianShi.play(CCTV4DianShiTai.INSTANCE);
            dianShi.play(CCTV5DianShiTai.getInstance("CCTV5DianShiTai"));
            dianShi.play(CCTV6DianShiTai.getInstance());
    }

}
