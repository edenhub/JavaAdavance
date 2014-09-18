package IntroAlgo.Select.TipSelectImple;

import IntroAlgo.Select.AbsCmpTipSelecter;

/**
 * Created by adam on 14-9-18.
 */
public class BaseTipSelecter extends AbsCmpTipSelecter{
    @Override
    public Object selectTip(int index) {
        return null;
    }

    @Override
    public Object selectTip() {
        Object tip = datas[0];

        for (int i=1;i<datas.length-1;i++)
            if (comparator.compare(tip,datas[i])>0)
                tip = datas[i];

        return tip;
    }
}
