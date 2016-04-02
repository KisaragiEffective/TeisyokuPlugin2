package net.jp.minecraft.plugins.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import net.jp.minecraft.plugins.Utility.Msg;

public class Command_CartHelp implements CommandExecutor {
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){

        if(args.length != 0){
        	
            Msg.warning(sender,"引数が多すぎです");
            
            return true;
            
        }
        Msg.info(sender, ChatColor.AQUA + "---------------[MineCartHelp]---------------" + ChatColor.GRAY + "(開発:azuhata)", false);
        Msg.info(sender, "Minecart看板 : 看板の1行目に[Minecart] 3行目にShinkansen Express Local SightSeeing のどれかを入力", false);
        Msg.info(sender, "アクティベーターレール : 最高速度を通常Minecartの最高速度に再設定します", false);
        Msg.info(sender, "Shinkansen対応ブロック : 鉄ブロック 黒曜石", false);
        Msg.info(sender, "Express対応ブロック : 石 レッドストーンブロック 鉄ブロック ハーフブロック 石レンガ 砂利 黒曜石", false);
        Msg.info(sender, "Local対応ブロック : レールが設置できるものすべて", false);
        Msg.info(sender, "SightSeeing対応ブロック : レールが設置できるものすべて", false);
        Msg.info(sender, "注意点 : Shinkansenは超高速であるため、カーブや坂の前は必ず減速してください", false);
        Msg.info(sender, ChatColor.AQUA + "--------------------------------------------", false);
        
        
        return true;
        
	}

}

	