public class ValidateAccount {
    //Kiem tra dang nhap
        public final String MOBILE = "090499999";
        public final String PASSWORLD = "Ngo Van Khoai";
        public boolean checkAccount(String mobile,String passworld){
            if (mobile.equals(MOBILE)){
                if (passworld.equals(PASSWORLD)) {
                    System.out.println("Đăng nhập thành công");
                    return true;
                }else {
                    System.out.println("Mật khẩu sai, vui lòng đăng nhập lại");
                    return false;
                }
            }else  {
                System.out.println("Kiểm tra lại số điện thoại hoặc passworld");
                return false;
            }
        }
}
