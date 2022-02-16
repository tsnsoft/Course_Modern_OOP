package tsn_java_basics;

import tsn_java_basics.lists.list.DemoArrayList;
import tsn_java_basics.lists.list.DemoLinkedList;
import tsn_java_basics.lists.map.DemoHashMap;
import tsn_java_basics.lists.DemoQueue;
import tsn_java_basics.lists.DemoSet;
import tsn_java_basics.lists.map.DemoTreeMap;
import tsn_java_basics.sys.DemoVarArgs;
import tsn_java_basics.types.DemoEnums;
import tsn_java_basics.types.DemoGenericTypes;

public class Launcher {

    public static void main(String[] args) {
        new DemoEnums();
        new DemoGenericTypes();
        new DemoArrayList();
        new DemoLinkedList();
        new DemoHashMap();
        new DemoTreeMap();
        new DemoQueue();
        new DemoSet();
        new DemoVarArgs();
    }
}
