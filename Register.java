// 6510450399 Tibet Charoensripaiboon


public class Register {

        public static boolean register(User user) {
            user.verify();
            user.getEmail().verify();
            return true;
        }



}