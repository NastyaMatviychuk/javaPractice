package collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        list.add("first");
//        list.add("second");
//        list.add("third");
//        System.out.println(list);
//        list.add(1, "another");
//        System.out.println(list);
//        System.out.println(list.get(2));
//        System.out.println(list.contains("first")); //method "equals" under hood
//        System.out.println(list.indexOf("second"));
//        list.add("first");
//        System.out.println(list);
//        list.remove("first");
//        System.out.println(list);
//        List<String> secondList = Arrays.asList("1", "2", "3");
//        list.addAll(secondList);
//        System.out.println(list);
////        list.removeAll(Arrays.asList("2", "1"));
//        System.out.println(list);
//        System.out.println(list.containsAll(Arrays.asList("2", "1")));
//        list.set(0, "111");
//        System.out.println(list);
//
//        List<String> linkedList = new LinkedList<>();
//        System.out.println();
//        for (String s : list) {
//            System.out.print(s + " ");
//        }
//        List<User> users= new ArrayList<>();
//        users.add(new User(1, "Nastya"));
//        users.add(new User(2, "Olya"));
//        users.add(new User(4, "Oleg"));
//        for (User u : users) {
//            u.setId(u.getId() + 2);
//            if(u.getName().startsWith("O"))
//                System.out.println(u);
//        }
//        Iterator<User> iterator = users.iterator();
////        System.out.println(iterator.next());
//        while(iterator.hasNext()){
//            User u = iterator.next();
//            if (u.getName().startsWith("N"))
//                iterator.remove();
////            System.out.println(iterator.next());
//        }
//        for (User user : users) {
//            System.out.println(user);
//        }


//        Set<String> set = new HashSet<>();
//        set.add("first");
//        set.add("second");
//        set.add("third");
//        System.out.println(set);
//        set.add("second");
//        System.out.println(set);

//        Set<String> linkedSet = new LinkedHashSet<>();
//        linkedSet.add("FIRST");
//        linkedSet.add("SECOND");
//        linkedSet.add("THIRD");
//        System.out.println(linkedSet);

        Set<String> treeSetStr = new TreeSet<>();
        treeSetStr.add("first");
        treeSetStr.add("second");
        treeSetStr.add("third");
        treeSetStr.add("fourth");
        System.out.println(treeSetStr);
        Set<User> users = new TreeSet<>();
        users.add(new User(1, "Nastya"));
        users.add(new User(2, "Olya"));
        users.add(new User(4, "Nazar"));

        Map<String, User> map = new HashMap<>();
        map.put("first", new User(1, "Igor"));
        map.put("second", new User(2, "Ivan"));
        map.put("third", new User(3, "Nazar"));
        System.out.println(map);
        System.out.println(map.containsKey("second"));
        System.out.println(map.containsValue(new User(3, "Nazar")));
        Set<Map.Entry<String, User>> entrySet = map.entrySet();
        for (Map.Entry<String, User> stringUserEntry : entrySet) {
            if (stringUserEntry.getKey().equals("first")){
                stringUserEntry.getValue().setId(stringUserEntry.getValue().getId() + 10);
                System.out.println(stringUserEntry);
            }
        }
        System.out.println(map);
    }
}
