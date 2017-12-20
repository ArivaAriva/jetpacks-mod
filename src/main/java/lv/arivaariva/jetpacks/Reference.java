package lv.arivaariva.jetpacks;

public class Reference {
	public static final String MOD_ID = "jp";
	public static final String NAME = "Jetpacks";
	public static final String VERSION = "1.0";

	public static final String CLIENT_PROXY_CLASS = "lv.arivaariva.jetpacks.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "lv.arivaariva.jetpacks.proxy.ServerProxy";
	
	public static enum CustomItems {
		flyumingot("flyumingot", "iflyumingot"),
		advanciumingot("advanciumingot", "iadvanciumingot"),
        masteriumingot("masteriumingot", "imasteriumingot"),
		flyumNugget("flyumnugget","iflyumnugget"),
		advanciumNugget("advanciumnugget","iadvanciumnugget"),
		masteriumNugget("masteriumnugget","imasteriumnugget"),
		flyumhoe("flyumhoe","tflyumhoe"),
		flyumpickaxe("flyumpickaxe","tflyumpickaxe"),
		flyumshovel("flyumshovel","tflyumshovel"),
		flyumaxe("flyumaxe","tflyumaxe"),
		flyumsword("flyumsword","tflyumsword"),
		advanciumhoe("advanciumhoe","tadvanciumhoe"),
		advanciumpickaxe("advanciumpickaxe","tadvanciumpickaxe"),
		advanciumshovel("advanciumshovel","tadvanciumshovel"),
		advanciumaxe("advanciumaxe","tadvanciumaxe"),
		advanciumsword("advanciumsword","tadvanciumsword"),
		masteriumhoe("masteriumhoe","tmasteriumhoe"),
		masteriumpickaxe("masteriumpickaxe","tmasteriumpickaxe"),
		masteriumshovel("masteriumshovel","tmasteriumshovel"),
		masteriumaxe("masteriumaxe","tmasteriumaxe"),
		masteriumsword("masteriumsword","tmasteriumsword");
		
		private String unlocalizedName;
		private String registryName;
		
		CustomItems(String unlocalizedName, String registryName)
		{
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
		
		public String getRegistryName()
		{
			return registryName;
		}
	}
	
	public static enum CustomBlocks {
		jetpackcharger("jetpackcharger", "blockjetpackcharger"),
		flyumore("flyumore","blockflyumore"),
		advanciumore("advanciumore","blockadvanciumore"),
		masteriumore("masteriumore","blockmasteriumore"),
		flyumblock("flyumblock","blockflyum"),
		advanciumblock("advanciumblock","blockadvancium"),
		masteriumblock("masteriumblock","blockmasterium");
		
		private String unlocalizedName;
		private String registryName;
		
		CustomBlocks(String unlocalizedName, String registryName)
		{
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
		
		public String getRegistryName()
		{
			return registryName;
		}
	}
	

}
