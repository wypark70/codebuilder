package egovframework.codebuilder.vo;

import java.io.Serializable;

public class TablesVO implements Serializable {
	private static final long serialVersionUID = 4641518830139201439L;
	private String tableName;
	private String tableComments;

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public String getTableComments() {
		return tableComments;
	}

	public void setTableComments(String tableComments) {
		this.tableComments = tableComments;
	}

}
