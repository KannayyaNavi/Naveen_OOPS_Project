class Palindrome{
	public static boolean isPalindrome(String str){
	String reverse = reverseString(str);
	if(str.equals(reverse)){
	return true;
	}
	return false;
	}
	public static String reverseString(String str){
	if(str==null||str.isEmpty()){
	return str;
	}
	return str.charAt(str.length()-1)+reverseString(str.subString(0,str.length()-1);
	public static void main(String[] args){
	String str="AKKA";
	System.out.println(isPalindrome(str));
	}
}