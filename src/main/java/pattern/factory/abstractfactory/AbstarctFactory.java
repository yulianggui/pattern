package pattern.factory.abstractfactory;

import pattern.factory.IPay;
import pattern.factory.IStore;

/**
 * create by zhegui on 2018/9/24
 */
public abstract class AbstarctFactory {

    abstract IPay getPay();

    abstract IStore getStore();
}
