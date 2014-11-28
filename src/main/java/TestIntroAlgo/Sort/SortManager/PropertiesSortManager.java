package TestIntroAlgo.Sort.SortManager;

import TestIntroAlgo.Exception.MethodNotUseException;
import TestIntroAlgo.Sort.Exception.TypeNotFoundException;
import TestIntroAlgo.Sort.Sorter;

import java.io.IOException;
import java.util.Properties;

/**
 * Created by adam on 14-9-17.
 */
public class PropertiesSortManager implements ISortManager{
    private static PropertiesSortManager instance;
    private Properties properties;

    private PropertiesSortManager(){
        properties = new Properties();
        try {
            properties.load(this.getClass().getResourceAsStream("../../../Sorter.properties"));
//            properties.load(new FileInputStream("Sorter.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Sorter createSorter(String sorterName) throws Exception {
        if (!properties.containsKey(sorterName)) {
            throw new TypeNotFoundException("没有这个排序类型，请检查是否输入正确，或者使用checkType()查看可用类型");
        }

        Sorter sorter = (Sorter) Class.forName((String) properties.get(sorterName)).newInstance();

        return sorter;
    }

    @Override
    public Sorter createSorter(SortType sortType) throws Exception {
        throw new MethodNotUseException("该方法不可用请用 createSorter(String sorterName);");
    }

    @Override
    public void checkType() {
        System.out.println("[");
        for (Object key : properties.keySet()){
            System.out.println(key);
        }
        System.out.println("]");

    }

    public static PropertiesSortManager getInstance(){
        if (instance == null)
            instance = new PropertiesSortManager();

        return instance;
    }
}
