package j0526;

public class Classj0526_05 {

	public static void main(String[] args) {
		String str1 = "【파이낸셜뉴스 인천=한갑수 기자】 인천시는 지역 수돗물인 인천하늘수와 시중에 판매 중인 생수 2종을 대상으로 블라인드 테스트로 조사한 결과 과반수 이상의 사람들이 인천하늘수를 가장 맛있는 물로 선택했다.\r\n"
				+ "인천시는 지난 19일 동인천역 북광장에서 열린 ‘제34회 화도진축제’에서 시민 2000여 명을 대상으로 블라인드 테스트로 맛있는 물을 조사한 결과 이 같이 나타났다고 26일 밝혔다.\r\n"
				+ "시는 어느 쪽이 수돗물인지 미리 알리지 않고 인천하늘수와 먹는 샘물 2종을 비교해 마시는 블라인드 테스트로 인천하늘수 시음회를 진행됐다.\r\n"
				+ "인천시민 2005명을 대상으로 시음회를 진행한 결과 참여 시민 중 66.7%에 달하는 1338명이 인천하늘수가 가장 맛있다고 응답했다.\r\n"
				+ "이어 별 차이 없다는 13%의 시민 외에 먹는 샘물 2종을 선택한 시민은 28%에 불과했다.\r\n"
				+ "시음회에 참여해 수돗물에 대한 막연한 불신감을 해소한 500여 명의 시민은 환경을 위한 일상 속 수돗물 음용에 동참하는 음용 서약서를 작성했다.\r\n"
				+ "또 인천하늘수 OX 퀴즈, 음용서약, 에코꼬미와 함께하는 포토존 등 다채로운 이벤트가 진행됐다.\r\n"
				+ "이응길 인천시 상수도사업본부장은“앞으로도 인천하늘수의 우수성을 알리기 위한 다양한 캠페인을 추진하고 시민과의 소통의 폭을 넓혀가겠다”고 말했다.\r\n";
		String str2 = "【파이낸셜뉴스 인천=한갑수 기자】 인천시는 지역 수돗물인 인천하늘수와 시중에 판매 중인 생수 2종을 대상으로 블라인드 테스트로 조사한 결과 과반수 이상의 사람들이 인천하늘수를 가장 맛있는 물로 선택했다.\r\n"
				+ "인천시는 지난 19일 동인천역 북광장에서 열린 ‘제34회 화도진축제’에서 시민 2000여 명을 대상으로 블라인드 테스트로 맛있는 물을 조사한 결과 이 같이 나타났다고 26일 밝혔다.\r\n"
				+ "시는 어느 쪽이 수돗물인지 미리 알리지 않고 인천하늘수와 먹는 샘물 2종을 비교해 마시는 블라인드 테스트로 인천하늘수 시음회를 진행됐다.\r\n"
				+ "인천시민 2005명을 대상으로 시음회를 진행한 결과 참여 시민 중 66.7%에 달하는 1338명이 인천하늘수가 가장 맛있다고 응답했다.\r\n"
				+ "이어 별 차이 없다는 13%의 시민 외에 먹는 샘물 2종을 선택한 시민은 28%에 불과했다.\r\n"
				+ "시음회에 참여해 수돗물에 대한 막연한 불신감을 해소한 500여 명의 시민은 환경을 위한 일상 속 수돗물 음용에 동참하는 음용 서약서를 작성했다.\r\n"
				+ "또 인천하늘수 OX 퀴즈, 음용서약,, 에코꼬미와 함께하는 포토존 등 다채로운 이벤트가 진행됐다.\r\n"
				+ "이응길 인천시 상수도사업본부장은“앞으로도 인천하늘수의 우수성을 알리기 위한 다양한 캠페인을 추진하고 시민과의 소통의 폭을 넓혀가겠다”고 말했다.\r\n";

		if(str1.equals(str2)) {
			System.out.println("같음");
		}else {
			System.out.println("다름");
		}
		
		System.out.println("hashCode str1 : "+str1.hashCode());
		System.out.println("hashCode str2 : "+str2.hashCode());
	}

}
