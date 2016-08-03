package br.com.projetodesoftware.criacionais.singleton;

public class ConfigManager {
	
	private static ConfigManager INSTANCE; // = new ConfigManager();
	private String serverName;
	
	private ConfigManager() {}
	
//	public static ConfigManager getInstance() {
//		return INSTANCE;
//	}
	
	public static synchronized ConfigManager getInstance() {
		if (INSTANCE == null)
			INSTANCE = new ConfigManager();
		return INSTANCE;
	}

	public String getServerName() {
		return serverName;
	}

	public void setServerName(String serverName) {
		this.serverName = serverName;
	}

}