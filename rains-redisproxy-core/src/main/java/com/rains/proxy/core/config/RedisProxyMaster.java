/**
 * 
 */
package com.rains.proxy.core.config;


import java.io.Serializable;
import java.util.List;

/**
 * 主节点
 * @author dourx
 *
 */
public class RedisProxyMaster implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6861660674247475024L;

	private   int slotNum= -1;
	
	private String host;//主机名
	
	private int port;//端口号
	
	private RedisProxyPool redisProxyPool;//连接池配置
	
	private List<RedisProxySlave> redisProxyClusters;//多个从
	
	//private LoadBalance loadClusterBalance;//从权重


	public  int getSlotNum() {
		return slotNum;
	}

	public void setSlotNum(int slotNum) {
		this.slotNum = slotNum;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public RedisProxyPool getRedisProxyPool() {
		return redisProxyPool;
	}

	public void setRedisProxyPool(RedisProxyPool redisProxyPool) {
		this.redisProxyPool = redisProxyPool;
	}

	public List<RedisProxySlave> getRedisProxyClusters() {
		return redisProxyClusters;
	}

	public void setRedisProxyClusters(List<RedisProxySlave> redisProxyClusters) {
		this.redisProxyClusters = redisProxyClusters;
	}
}