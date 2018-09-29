package jp.co.netprotections.dto;

/**
 * リクエストされたJSONをマッピングするDTOです.
 * @author s.nozaki
 *
 */
public class RequestDto {

	/** ベース文字列 */
	private String string;
	/** 処理の有無判定フラグ */
	private boolean processFlag;

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	public boolean isProcessFlag() {
		return processFlag;
	}

	public void setProcessFlag(boolean processFlag) {
		this.processFlag = processFlag;
	}
}
