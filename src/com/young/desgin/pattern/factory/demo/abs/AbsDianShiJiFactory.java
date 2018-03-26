package com.young.desgin.pattern.factory.demo.abs;

import com.young.desgin.pattern.factory.demo.entity.DianShiJi;

//抽象工厂方法，抽象工厂方法是对工厂方法的进一步抽象，是负责一个产品族，而一个工厂方法只是负责某一个指定的产品
//抽象工厂通常配合工厂方法使用来创建。
//优点：更进一步解耦，用户使用过程中只关心工厂提供的选择，不需要额外关注具体实现和具体使用哪个工厂实现。
//缺点：扩展复杂，每增加一个产品族，那么所有的产品线必须全部实现。每增加一个具体产品线，所有具体实现都要进行修改。
public abstract class AbsDianShiJiFactory {

  public abstract   DianShiJi getChangHongJdf20();
  public abstract  DianShiJi getChangHongSanxin50();
  public abstract   DianShiJi getTCLSanxin20();
  public abstract   DianShiJi getTCLSanxin50();


}
