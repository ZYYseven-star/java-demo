public class Day2_test{
    public static void main(String[] args){
        System.out.println("===== 练习1：年龄判断 =====");
        checkAge(17);  // 测试
        checkAge(18);
        checkAge(25);

        System.out.println("\n===== 练习2：分数评级 =====");
        scoreLevel(95);
        scoreLevel(82);
        scoreLevel(65);
        scoreLevel(50);

        System.out.println("\n===== 练习3：用户状态判断 =====");
        checkUserStatus(16, true);
        checkUserStatus(22, true);
        checkUserStatus(30, false); 
    }
    public static void checkAge(int age){
        if (age>=18){
            System.out.println(age + "岁,已成年，可以正常使用系统。");
        }else{
            System.out.println(age + "岁，未成年，禁止使用本系统");
        }
    }
    public static void scoreLevel(double score){
        String level;
        if (score >= 90){
            level = "A(优秀)";
        }else if (score >= 80 && score < 90){
            level = "B(良好)";
        }else if (score >= 60 && score < 80){
            level = "C(及格)";
        }else{
            level = "D(不及格)";
        }
        System.out.println("考试分数:" + score + ",评级:" + level);
    }
    public static void checkUserStatus(int userAge,boolean isVip){
        if (userAge < 18){
            System.out.println("未成年账号，功能受限");
        }else if (isVip == true){
            System.out.println("VIP用户，解锁全部功能");
        }else{
            System.out.println("普通用户，仅开放基础功能");
        }
    }

}





