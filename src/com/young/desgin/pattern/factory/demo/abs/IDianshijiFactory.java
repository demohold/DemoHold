package com.young.desgin.pattern.factory.demo.abs;

import com.young.desgin.pattern.factory.demo.entity.DianShiJi;
import com.young.desgin.pattern.factory.demo.entity.PinMu;

public interface IDianshijiFactory {
   DianShiJi getDianShiJi(PinMu pm);
}
