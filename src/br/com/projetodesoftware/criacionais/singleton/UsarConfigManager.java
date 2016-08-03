package br.com.projetodesoftware.criacionais.singleton;

public class UsarConfigManager {

	public static void main(String[] args) {
		
		ConfigManager.getInstance().setServerName("Nome servidor");
		
		String s = ConfigManager.getInstance().getServerName();
		
		ConfigManager configManager = ConfigManager.getInstance();
		
		System.out.println(configManager.getServerName());	
	}
	
}
