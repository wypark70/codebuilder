package egovframework.codebuilder.vo;

import java.io.Serializable;

public class TableColumnsVO implements Serializable {
	private static final long serialVersionUID = 5685068431612147862L;

	private String tableName;
	private String tableComments;
	private String columnName;
	private String columnComments;
	private String dataType;
	private String dataLength;
	private String nullable;
	private int columnId;
	private String primaryKeyYn;

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

	public String getColumnName() {
		return columnName;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	public String getColumnComments() {
		return columnComments;
	}

	public void setColumnComments(String columnComments) {
		this.columnComments = columnComments;
	}

	public String getDataType() {
		return dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public String getDataLength() {
		return dataLength;
	}

	public void setDataLength(String dataLength) {
		this.dataLength = dataLength;
	}

	public String getNullable() {
		return nullable;
	}

	public void setNullable(String nullable) {
		this.nullable = nullable;
	}

	public int getColumnId() {
		return columnId;
	}

	public void setColumnId(int columnId) {
		this.columnId = columnId;
	}

	public String getPrimaryKeyYn() {
		return primaryKeyYn;
	}

	public void setPrimaryKeyYn(String primaryKeyYn) {
		this.primaryKeyYn = primaryKeyYn;
	}

}
