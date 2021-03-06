package jp.co.netprotections.dto;

/**
 * Controllerのレスポンスクラスです.
 * @author s.nozaki
 *
 */
public class ResponseDto {

	/** リクエストされたベース文字列 */
	private String string;
	/**  ベース文字列の文字数 */
	private int strLength;

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	public int getStrLength() {
		return strLength;
	}

	public void setStrLength(int strLength) {
		this.strLength = strLength;
	}

}
