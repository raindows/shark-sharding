package com.sharksharding.model;

import com.sharksharding.common.Constants;

import java.util.List;
import java.util.Map;

/**
 * <p>数据源配置元素 Model</p>
 * <pre>
 *     author      XueQi
 *     date        2018/8/9
 *     email       job.xueqi@outlook.com
 * </pre>
 */
public class MatrixDataSourceMetaModel {
	// id 属性值
	private String matrixName;
	// 数据源事务管理器
	private String transactionManager       = Constants.DEFAULT_TRANSACTION_MANAGER_NAME;
	// mybatis sqlsession factory
	private String mybatisSqlSessionFactory = Constants.DEFAULT_MYBATIS_SQLSESSION_FACTORY_NAME;
	// 数据源 Group 列表
	private List<MatrixDataSourceGroupModel>       matrixDataSourceGroupList;
	// 连接池配置
	private Map<String, MatrixPoolConfigMetaModel> atomDataSourcePoolConfig;
	// 分表配置 pointcut expression
	private String                                 tableShardingPointcut;
	// 分库配置 pointcut expression
	private String                                 repositoryShardingPointcut;


	public String getMatrixName() {
		return matrixName;
	}

	public void setMatrixName(String matrixName) {
		this.matrixName = matrixName;
	}

	public String getTransactionManager() {
		return transactionManager;
	}

	public void setTransactionManager(String transactionManager) {
		this.transactionManager = transactionManager;
	}

	public String getMybatisSqlSessionFactory() {
		return mybatisSqlSessionFactory;
	}

	public void setMybatisSqlSessionFactory(String mybatisSqlSessionFactory) {
		this.mybatisSqlSessionFactory = mybatisSqlSessionFactory;
	}

	public List<MatrixDataSourceGroupModel> getMatrixDataSourceGroupList() {
		return matrixDataSourceGroupList;
	}

	public void setMatrixDataSourceGroupList(List<MatrixDataSourceGroupModel> matrixDataSourceGroupList) {
		this.matrixDataSourceGroupList = matrixDataSourceGroupList;
	}

	public Map<String, MatrixPoolConfigMetaModel> getAtomDataSourcePoolConfig() {
		return atomDataSourcePoolConfig;
	}

	public void setAtomDataSourcePoolConfig(Map<String, MatrixPoolConfigMetaModel> atomDataSourcePoolConfig) {
		this.atomDataSourcePoolConfig = atomDataSourcePoolConfig;
	}

	public String getTableShardingPointcut() {
		return tableShardingPointcut;
	}

	public void setTableShardingPointcut(String tableShardingPointcut) {
		this.tableShardingPointcut = tableShardingPointcut;
	}

	public String getRepositoryShardingPointcut() {
		return repositoryShardingPointcut;
	}

	public void setRepositoryShardingPointcut(String repositoryShardingPointcut) {
		this.repositoryShardingPointcut = repositoryShardingPointcut;
	}
}
