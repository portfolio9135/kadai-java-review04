package baseball;

public class Review03 {

	public static void main(String[] args) {
		BaseBallTeam baseballteam01 = new BaseBallTeam("東京ヤクルトスワローズ", 80, 59, 4);
		BaseBallTeam baseballteam02 = new BaseBallTeam("横浜DeNAベイスターズ", 73, 68, 2);
		BaseBallTeam baseballteam03 = new BaseBallTeam("阪神タイガース", 68, 71, 4);
		BaseBallTeam baseballteam04 = new BaseBallTeam("読売ジャイアンツ", 68, 72, 3);
		BaseBallTeam baseballteam05 = new BaseBallTeam("広島東洋カープ", 66, 74, 3);
		BaseBallTeam baseballteam06 = new BaseBallTeam("中日ドラゴンズ", 66, 75, 2);
		
		baseballteam01.report();
		baseballteam02.report();
		baseballteam03.report();
		baseballteam04.report();
		baseballteam05.report();
		baseballteam06.report();
	}
}
