package SandBox.hashmaps;



public class HashMap {
    public static void main(String[] args) {
        java.util.HashMap<String, Integer> hashMapParams = new java.util.HashMap<>();

        hashMapParams.put("param1", 130);
        hashMapParams.put("param2", 4);
        hashMapParams.put("param3", 564);

        System.out.println(hashMapParams.get("param1"));
        if (hashMapParams.containsKey("param1")) {
            System.out.println("Key param1 is present");
            if (hashMapParams.get("param1") == 130) {
                System.out.println("yeah , pram1 value is 130");
            }
        }

    }
}
