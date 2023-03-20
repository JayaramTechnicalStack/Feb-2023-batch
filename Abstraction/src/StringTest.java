import java.util.HashMap;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String decodeStr = "token=86123456&userId=abc&groupName=IT";
		HashMap<String,String> map = new HashMap<>();
		
		
		String [] pairs = decodeStr.split("&");

		int count = 0;
		for(String keyValue : pairs) {
			String[]  str = keyValue.split("=");
			map.put(str[0],str[1]);
			//String token1 = str[0];
			System.out.println(str[0]);
			System.out.println(count);
			count++;
			System.out.println(map);
			
		}
		/*
		 * System.out.println(pairs[0]); String token = pairs[0]; String userId =
		 * pairs[1]; String groupName = pairs[2]; System.out.println(token + " " +
		 * userId+ " " + groupName);
		 */
		
		
	}

}
