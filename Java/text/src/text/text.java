package text;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Vector;

public class text {
	public static void main(String []arg) {

		String v1=new String("回锅肉是中国川菜中一种烹调猪肉的传统菜式，川西地区还称之为熬锅肉。四川家家户户都能制作。回锅肉的特点是口味独特，色泽红亮，肥而不腻。所谓回锅，就是再次烹调的意思。回锅肉作为一道传统川菜，在川菜中的地位是非常重要的，川菜考级经常用回锅肉作为首选菜肴。回锅肉一直被认为是川菜之首，川菜之化身，提到川菜必然想到回锅肉。");
		String v2=new String("剁椒鱼头(英文名:Chop bell pepper fish head)是湖南传统名菜。据传，起源和清代文人黄宗宪有关。通常以鳙鱼鱼头、剁椒为主料，配以豉油、姜、葱、蒜等辅料蒸制而成。菜品色泽红亮、味浓、肉质细嫩。肥而不腻、口感软糯、鲜辣适口。");
		String v3=new String("辣子鸡，全称\"枣庄辣子鸡\"，\"枣庄大盘辣子鸡\"。枣庄是中国辣子鸡之乡，其为鲁南地区颇具特色的美食。特点是鲜、辣、香，色艳味重。烹炒鸡肉多以本地散养公鸡为佳，其中最以老公鸡和小公鸡最为优选。现又被枣庄的厨师们创造性的开发出一系列的衍生菜:小鸡泡馍、麻花辣子鸡、面条鸡、地锅饼辣子鸡等。");
		String v4=new String("麻婆豆腐是四川省汉族传统名菜之一，属于川菜系。主要原料为配料和豆腐，材料主要有豆腐、牛肉末(也可以用猪肉)、辣椒和花椒等。麻来自花椒，辣来自辣椒，这道菜突出了川菜\"麻辣\"的特点。麻婆豆腐在不同的地区有不同的做法，南方做法多数会放些许肉末，而北方就是单纯的放置辣椒和花椒。\r\n" + 
				"此菜大约在清代同治初年(1874年以后)，由成都市北郊万福桥一家名为\"陈兴盛饭铺\"的小饭店老板娘陈刘氏所创。因为陈刘氏脸上有麻点，人称陈麻婆，她发明的烧豆腐就被称为\"陈麻婆豆腐\"。\r\n" + 
				"");
		String v5=new String("烤鱼是指鱼类经过烤制之后然后进行烹饪的一种方法，这种烹调方式实现了\"一烤二炖\"。是烤鱼界的一次新变革。现在提到\"烤鱼\"大多指\"川味烤鱼\"。\r\n" + 
				"烤鱼，一种发源于重庆巫溪，而发扬于万州的特色美食，在流传过程中，融合腌、烤、炖三种烹饪工艺技术，充分借鉴传统川菜及川味火锅用料特点，是口味奇绝、营养丰富的风味小吃。\r\n" + 
				"");
		String v6=new String("豆干是豆腐干的简称，中国传统豆制品之一，是豆腐的再加工制品。咸香爽口，硬中带韧，久放不坏，是中国各大菜系中都有一道美食。出产于中国华南，江南地区。\r\n" + 
				"豆干营养丰富，含有大量蛋白质、脂肪、碳水化合物，还含有钙、磷、铁等多种人体所需的矿物质。豆腐干在制作过程中会添加食盐、茴香、花椒、大料、干姜等调料，既香又鲜，久吃不厌，被誉为\"素火腿\"。\r\n" + 
				"");
		
		
		String v7=new String("以火龙果为主的水果沙拉。");
		String v8=new String("五香老卤牛肉，是卤味中非常经典的，其使用的传统五香制法将牛肉卤制的无与伦比，酱香浓郁，从而深得消费大众喜爱，");
		String v9=new String("有嚼劲的金针菇绝对带感，有营养又好吃。");
		String v10=new String("凉拌秋葵是用秋葵制作的一道家常菜。味道奇特，凉性食材，不可多吃。主要食材有秋葵、芥末、蚝油、生抽等。秋葵含有果胶、牛乳聚糖等，具有帮助消化、治疗胃炎和胃溃疡、保护皮肤和胃黏膜之功效，被誉为人类最佳的保健蔬菜之一。");
		String v11=new String("蔬菜水果清新口感。\r\n" + 
				"");
		String v12=new String("西柚为主题的凉拌菜。");
		
		
		String v13=new String("叉烧酥是广东省的地方传统名点，属于粤菜系。由于是烤的，所以它比其他点心较为干身，切开后露出叉烧馅料，渗发出阵阵叉烧的香味。叉烧酥的温度是优劣的关键，拿出后放在烤架拿出后放在烤架上冷却，这个时候的叉烧酥都是很酥很酥的，放进密封盒后会稍软，但是也很好吃。");
		String v14=new String("焦糖布丁，是布丁的一种，也是一道西餐食品，是用面粉、牛奶、鸡蛋、水果等材料制成的。千百年来，世界各地的人对它的喜爱带给了它不一样的形态，如香甜如蜜的西班牙芙朗，浪漫的法国烤布蕾等。");
		String v15=new String("韭菜盒子是中国北方地区陕西、山西等地非常流行的汉族小吃，在有些地区也是节日食品。一般选春季头刀韭菜和鸡蛋为主要原料加工制作而成的食品，适宜于春季食用。\r\n" + 
				"该制品表皮金黄酥脆。馅心韭香脆嫩，滋味优美，是适时佳点\r\n" + 
				"");
		String v16=new String("巧克力(chocolate)，原产中南美洲，其鼻祖是\"xocolatl\"，意为\"苦水\"。其主要原料可可豆产于赤道南北纬18度以内的狭长地带。\r\n" + 
				"巧克力的主要成分是可可脂，可可脂中含有可可碱，对多种动物有毒， 但对人类来说，可可碱是一种健康的反镇静成分，故食用巧克力有提升精神，增强兴奋等功效，可可含有苯乙胺，坊间流传着能够使人有恋爱的感觉的流言。\r\n" + 
				"");
		String v17=new String("螺旋藻水饺是一款美食，主料有螺旋藻、水饺等。");
		String v18=new String("水果大杂烩。");
		
		
		String v19=new String("干煸肉丝是一道四川省的传统名菜，属于川菜菜系，咸鲜味浓，干辣下饭，香酥可口。能增强食欲，促消化，营养价值丰富。是以瘦肉和干辣椒为主要食材的家常菜，猪肉切成长约6厘米的二组丝。鲜笋切成长约5厘米的二粗丝。葱、干辣椒分别切成细丝。锅置中火上，下素油烧热(约120℃)，放入干辣椒丝炸成棕红色捞起，再下肉丝，煸干水气，加入料酒、盐。酱油、笋丝继续煸炒，煸至干香亮油时，下辣椒丝、味精炒匀，起锅装盘，撒上葱丝即成。");
		String v20=new String("宫保鸡丁，创始人是四川地区居民，后被清朝四川总督丁宝桢改良发扬，流传至今，此道菜也被归纳为北京宫廷菜。之后宫保鸡丁也流传到国外。\r\n" + 
				"选用鸡肉为主料，花生米、黄瓜、辣椒等辅料烹制而成。 红而不辣、辣而不猛、香辣味浓、肉质滑脆。由于其入口鲜辣，鸡肉的鲜嫩配合花生的香脆。\r\n" + 
				"");
		String v21=new String("乳鸽的骨内含有丰富的软骨素，可与鹿茸中的软骨素相媳美，经常食用，具有改善皮肤细胞活力，增强度肤弹性，改善血液循环，面色红润等功效。鸽肉中还含有丰富的泛酸，对脱发、白发和未毛先衰等有很好的疗效。乳鸽含有较多的支链氨基酸和精氨酸可促进体内蛋白质的合成，加快创伤愈合。中医认为，鸽肉易于消化，具有滋补益气、祛风解毒的功能，对病后体弱、血虚闭经、头晕神疲、记亿衰退有很好的补益治疗作用。美食性味：味甘、咸，性");
		String v22=new String("芥菜汤清热解毒，口感清淡。");
		String v23=new String("蒜苔炒腊肉是一道湖南家常菜品，以蒜苔、腊肉等为原材料的制作。");
		String v24=new String("鱼香茄子是汉族特色名菜，属中国八大菜系的，主料为茄子，配以多种辅料加工烧制而成。有多种不同制法，其味道鲜美，营养丰富。鱼香茄子与鱼香猪肝、鱼香肉丝和鱼香三丝等川菜齐名，深受欢迎。\r\n" + 
				"”鱼香“与”余香“谐音，正确的书写应该是余香茄子。余香系列的川菜，最主要的辅料是四川辣豆瓣酱。主料配以四川辣豆瓣酱加上其他调料烧出来的菜肴，其味厚重悠长，余味缭绕，回味无穷，故称余香。上世纪七十年代之前，餐馆菜单上书写的都是余香茄子。\r\n" + 
				"");
		
		
		String v25=new String("柿子可以清热润肺、化痰止咳,主治燥热咳嗽、肠道燥热或痔疮出血。与此同时,柿子还有缓解高血压以及动脉硬化等作用。");
		String v26=new String("牛扒即牛排 英文统称STEAK，其种类非常多，常见的有:TENDERLOIN(嫩 牛柳，牛里脊)，又叫FILLET(菲力)RIB-EYE(肉眼牛扒 ) SIRLOIN(西冷牛扒) T-BONE(T骨牛扒) 牛扒是西餐的一种， 被现今都市所接受");
		String v27=new String("陕北肉夹馍，地道正宗。\r\n" + "");
		String v28=new String("春卷，又称春饼、春盘、薄饼。是中国民间节日的一种传统食品，流行于中国各地，在江南等地尤盛。在中国南方，过春节不吃饺子，吃春卷和芝麻汤圆。并且在漳州一带清明时节也吃春卷，民间除供自己家食用外，常用于待客。春卷历史悠久，由古代的春饼演化而来。");
		String v29=new String("鲜脆酥炸藕片(注音:xian cui su zha ou pian)莲藕有粉藕与脆藕之分,粉藕呈微红色,易煮烂,口感粉滑,适合炖汤;脆藕呈浅白色,不易煮烂、韧性好,甜嫩多汁,可清炒、凉拌或油炸。");
		String v30=new String("豆沙黄金饼是一道美味，主要材料有面粉、红豆沙等。");
		
		
		String v31=new String("回锅肉是中国川菜中一种烹调猪肉的传统菜式，川西地区还称之为熬锅肉。四川家家户户都能制作。回锅肉的特点是口味独特，色泽红亮，肥而不腻。所谓回锅，就是再次烹调的意思。回锅肉作为一道传统川菜，在川菜中的地位是非常重要的，川菜考级经常用回锅肉作为首选菜肴。回锅肉一直被认为是川菜之首，川菜之化身，提到川菜必然想到回锅肉。");
		String v32=new String("剁椒鱼头(英文名:Chop bell pepper fish head)是湖南传统名菜。据传，起源和清代文人黄宗宪有关。通常以鳙鱼鱼头、剁椒为主料，配以豉油、姜、葱、蒜等辅料蒸制而成。菜品色泽红亮、味浓、肉质细嫩。肥而不腻、口感软糯、鲜辣适口。");
		String v33=new String("焦糖布丁，是布丁的一种，也是一道西餐食品，是用面粉、牛奶、鸡蛋、水果等材料制成的。千百年来，世界各地的人对它的喜爱带给了它不一样的形态，如香甜如蜜的西班牙芙朗，浪漫的法国烤布蕾等。");
		String v34=new String("巧克力(chocolate)，原产中南美洲，其鼻祖是\\\"xocolatl\\\"，意为\\\"苦水\\\"。其主要原料可可豆产于赤道南北纬18度以内的狭长地带。\\r\\n\" + \r\n" + 
				"				\"巧克力的主要成分是可可脂，可可脂中含有可可碱，对多种动物有毒， 但对人类来说，可可碱是一种健康的反镇静成分，故食用巧克力有提升精神，增强兴奋等功效，可可含有苯乙胺，坊间流传着能够使人有恋爱的感觉的流言。\\r\\n\" + \r\n" + 
				"				\"");
		String v35=new String("宫保鸡丁，创始人是四川地区居民，后被清朝四川总督丁宝桢改良发扬，流传至今，此道菜也被归纳为北京宫廷菜。之后宫保鸡丁也流传到国外。\\r\\n\" + \r\n" + 
				"				\"选用鸡肉为主料，花生米、黄瓜、辣椒等辅料烹制而成。 红而不辣、辣而不猛、香辣味浓、肉质滑脆。由于其入口鲜辣，鸡肉的鲜嫩配合花生的香脆。\\r\\n\" + \r\n" + 
				"				\"");
		String v36=new String("乳鸽的骨内含有丰富的软骨素，可与鹿茸中的软骨素相媳美，经常食用，具有改善皮肤细胞活力，增强度肤弹性，改善血液循环，面色红润等功效。鸽肉中还含有丰富的泛酸，对脱发、白发和未毛先衰等有很好的疗效。乳鸽含有较多的支链氨基酸和精氨酸可促进体内蛋白质的合成，加快创伤愈合。中医认为，鸽肉易于消化，具有滋补益气、祛风解毒的功能，对病后体弱、血虚闭经、头晕神疲、记亿衰退有很好的补益治疗作用。美食性味：味甘、咸，性");
		
		
		try {
			



				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				DataOutputStream dos=new DataOutputStream(new FileOutputStream(""+1+".doc"));
				BufferedWriter bw = new BufferedWriter(new FileWriter(""+1+".doc"));
				String desknum=new String(v1);
				
				
				bw.write(desknum+"\n");
	
				bw.close();
				dos.close();
				br.close();

			

		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			



				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				DataOutputStream dos=new DataOutputStream(new FileOutputStream(""+2+".doc"));
				BufferedWriter bw = new BufferedWriter(new FileWriter(""+2+".doc"));
				String desknum=new String(v2);
				
				
				bw.write(desknum+"\n");
	
				bw.close();
				dos.close();
				br.close();

			

		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			



				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				DataOutputStream dos=new DataOutputStream(new FileOutputStream(""+3+".doc"));
				BufferedWriter bw = new BufferedWriter(new FileWriter(""+3+".doc"));
				String desknum=new String(v3);
				
				
				bw.write(desknum+"\n");
	
				bw.close();
				dos.close();
				br.close();
			
			

		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			


	
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				DataOutputStream dos=new DataOutputStream(new FileOutputStream(""+4+".doc"));
				BufferedWriter bw = new BufferedWriter(new FileWriter(""+4+".doc"));
				String desknum=new String(v4);
				
				
				bw.write(desknum+"\n");
	
				bw.close();
				dos.close();
				br.close();
			
			

		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			


			
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				DataOutputStream dos=new DataOutputStream(new FileOutputStream(""+5+".doc"));
				BufferedWriter bw = new BufferedWriter(new FileWriter(""+5+".doc"));
				String desknum=new String(v5);
				
				
				bw.write(desknum+"\n");
	
				bw.close();
				dos.close();
				br.close();
			
			

		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			


			
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				DataOutputStream dos=new DataOutputStream(new FileOutputStream(""+6+".doc"));
				BufferedWriter bw = new BufferedWriter(new FileWriter(""+6+".doc"));
				String desknum=new String(v6);
				
				
				bw.write(desknum+"\n");
	
				bw.close();
				dos.close();
				br.close();
			
			

		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			


			
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				DataOutputStream dos=new DataOutputStream(new FileOutputStream(""+7+".doc"));
				BufferedWriter bw = new BufferedWriter(new FileWriter(""+7+".doc"));
				String desknum=new String(v7);
				
				
				bw.write(desknum+"\n");
	
				bw.close();
				dos.close();
				br.close();
			
			

		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			


			
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				DataOutputStream dos=new DataOutputStream(new FileOutputStream(""+8+".doc"));
				BufferedWriter bw = new BufferedWriter(new FileWriter(""+8+".doc"));
				String desknum=new String(v8);
				
				
				bw.write(desknum+"\n");
	
				bw.close();
				dos.close();
				br.close();
			
			

		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			


			
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				DataOutputStream dos=new DataOutputStream(new FileOutputStream(""+9+".doc"));
				BufferedWriter bw = new BufferedWriter(new FileWriter(""+9+".doc"));
				String desknum=new String(v9);
				
				
				bw.write(desknum+"\n");
	
				bw.close();
				dos.close();
				br.close();
			
			

		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			


			
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				DataOutputStream dos=new DataOutputStream(new FileOutputStream(""+10+".doc"));
				BufferedWriter bw = new BufferedWriter(new FileWriter(""+10+".doc"));
				String desknum=new String(v10);
				
				
				bw.write(desknum+"\n");
	
				bw.close();
				dos.close();
				br.close();
			
			

		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		try {
			



			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			DataOutputStream dos=new DataOutputStream(new FileOutputStream(""+21+".doc"));
			BufferedWriter bw = new BufferedWriter(new FileWriter(""+21+".doc"));
			String desknum=new String(v21);
			
			
			bw.write(desknum+"\n");

			bw.close();
			dos.close();
			br.close();

		

	} catch (FileNotFoundException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	try {
		



			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			DataOutputStream dos=new DataOutputStream(new FileOutputStream(""+22+".doc"));
			BufferedWriter bw = new BufferedWriter(new FileWriter(""+22+".doc"));
			String desknum=new String(v22);
			
			
			bw.write(desknum+"\n");

			bw.close();
			dos.close();
			br.close();

		

	} catch (FileNotFoundException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	try {
		



			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			DataOutputStream dos=new DataOutputStream(new FileOutputStream(""+23+".doc"));
			BufferedWriter bw = new BufferedWriter(new FileWriter(""+23+".doc"));
			String desknum=new String(v23);
			
			
			bw.write(desknum+"\n");

			bw.close();
			dos.close();
			br.close();
		
		

	} catch (FileNotFoundException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	try {
		



			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			DataOutputStream dos=new DataOutputStream(new FileOutputStream(""+24+".doc"));
			BufferedWriter bw = new BufferedWriter(new FileWriter(""+24+".doc"));
			String desknum=new String(v24);
			
			
			bw.write(desknum+"\n");

			bw.close();
			dos.close();
			br.close();
		
		

	} catch (FileNotFoundException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	try {
		


		
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			DataOutputStream dos=new DataOutputStream(new FileOutputStream(""+25+".doc"));
			BufferedWriter bw = new BufferedWriter(new FileWriter(""+25+".doc"));
			String desknum=new String(v25);
			
			
			bw.write(desknum+"\n");

			bw.close();
			dos.close();
			br.close();
		
		

	} catch (FileNotFoundException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	try {
		


		
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			DataOutputStream dos=new DataOutputStream(new FileOutputStream(""+26+".doc"));
			BufferedWriter bw = new BufferedWriter(new FileWriter(""+26+".doc"));
			String desknum=new String(v26);
			
			
			bw.write(desknum+"\n");

			bw.close();
			dos.close();
			br.close();
		
		

	} catch (FileNotFoundException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	try {
		


		
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			DataOutputStream dos=new DataOutputStream(new FileOutputStream(""+27+".doc"));
			BufferedWriter bw = new BufferedWriter(new FileWriter(""+27+".doc"));
			String desknum=new String(v27);
			
			
			bw.write(desknum+"\n");

			bw.close();
			dos.close();
			br.close();
		
		

	} catch (FileNotFoundException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	try {
		


		
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			DataOutputStream dos=new DataOutputStream(new FileOutputStream(""+28+".doc"));
			BufferedWriter bw = new BufferedWriter(new FileWriter(""+28+".doc"));
			String desknum=new String(v28);
			
			
			bw.write(desknum+"\n");

			bw.close();
			dos.close();
			br.close();
		
		

	} catch (FileNotFoundException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	try {
		


		
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			DataOutputStream dos=new DataOutputStream(new FileOutputStream(""+29+".doc"));
			BufferedWriter bw = new BufferedWriter(new FileWriter(""+29+".doc"));
			String desknum=new String(v29);
			
			
			bw.write(desknum+"\n");

			bw.close();
			dos.close();
			br.close();
		
		

	} catch (FileNotFoundException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	try {
		


		
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			DataOutputStream dos=new DataOutputStream(new FileOutputStream(""+30+".doc"));
			BufferedWriter bw = new BufferedWriter(new FileWriter(""+30+".doc"));
			String desknum=new String(v30);
			
			
			bw.write(desknum+"\n");

			bw.close();
			dos.close();
			br.close();
		
		

	} catch (FileNotFoundException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	try {
		



		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		DataOutputStream dos=new DataOutputStream(new FileOutputStream(""+31+".doc"));
		BufferedWriter bw = new BufferedWriter(new FileWriter(""+31+".doc"));
		String desknum=new String(v31);
		
		
		bw.write(desknum+"\n");

		bw.close();
		dos.close();
		br.close();

	

} catch (FileNotFoundException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
} catch (IOException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
}
try {
	



		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		DataOutputStream dos=new DataOutputStream(new FileOutputStream(""+32+".doc"));
		BufferedWriter bw = new BufferedWriter(new FileWriter(""+32+".doc"));
		String desknum=new String(v32);
		
		
		bw.write(desknum+"\n");

		bw.close();
		dos.close();
		br.close();

	

} catch (FileNotFoundException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
} catch (IOException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
}
try {
	



		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		DataOutputStream dos=new DataOutputStream(new FileOutputStream(""+33+".doc"));
		BufferedWriter bw = new BufferedWriter(new FileWriter(""+33+".doc"));
		String desknum=new String(v33);
		
		
		bw.write(desknum+"\n");

		bw.close();
		dos.close();
		br.close();
	
	

} catch (FileNotFoundException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
} catch (IOException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
}
try {
	



		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		DataOutputStream dos=new DataOutputStream(new FileOutputStream(""+34+".doc"));
		BufferedWriter bw = new BufferedWriter(new FileWriter(""+34+".doc"));
		String desknum=new String(v34);
		
		
		bw.write(desknum+"\n");

		bw.close();
		dos.close();
		br.close();
	
	

} catch (FileNotFoundException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
} catch (IOException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
}
try {
	


	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		DataOutputStream dos=new DataOutputStream(new FileOutputStream(""+35+".doc"));
		BufferedWriter bw = new BufferedWriter(new FileWriter(""+35+".doc"));
		String desknum=new String(v35);
		
		
		bw.write(desknum+"\n");

		bw.close();
		dos.close();
		br.close();
	
	

} catch (FileNotFoundException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
} catch (IOException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
}
try {
	


	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		DataOutputStream dos=new DataOutputStream(new FileOutputStream(""+36+".doc"));
		BufferedWriter bw = new BufferedWriter(new FileWriter(""+36+".doc"));
		String desknum=new String(v36);
		
		
		bw.write(desknum+"\n");

		bw.close();
		dos.close();
		br.close();
	
	

} catch (FileNotFoundException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
} catch (IOException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
}






























try {
	



	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	DataOutputStream dos=new DataOutputStream(new FileOutputStream(""+11+".doc"));
	BufferedWriter bw = new BufferedWriter(new FileWriter(""+11+".doc"));
	String desknum=new String(v11);
	
	
	bw.write(desknum+"\n");

	bw.close();
	dos.close();
	br.close();



} catch (FileNotFoundException e1) {
// TODO Auto-generated catch block
e1.printStackTrace();
} catch (IOException e1) {
// TODO Auto-generated catch block
e1.printStackTrace();
}
try {




	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	DataOutputStream dos=new DataOutputStream(new FileOutputStream(""+12+".doc"));
	BufferedWriter bw = new BufferedWriter(new FileWriter(""+12+".doc"));
	String desknum=new String(v12);
	
	
	bw.write(desknum+"\n");

	bw.close();
	dos.close();
	br.close();



} catch (FileNotFoundException e1) {
// TODO Auto-generated catch block
e1.printStackTrace();
} catch (IOException e1) {
// TODO Auto-generated catch block
e1.printStackTrace();
}
try {




	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	DataOutputStream dos=new DataOutputStream(new FileOutputStream(""+13+".doc"));
	BufferedWriter bw = new BufferedWriter(new FileWriter(""+13+".doc"));
	String desknum=new String(v13);
	
	
	bw.write(desknum+"\n");

	bw.close();
	dos.close();
	br.close();



} catch (FileNotFoundException e1) {
// TODO Auto-generated catch block
e1.printStackTrace();
} catch (IOException e1) {
// TODO Auto-generated catch block
e1.printStackTrace();
}
try {




	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	DataOutputStream dos=new DataOutputStream(new FileOutputStream(""+14+".doc"));
	BufferedWriter bw = new BufferedWriter(new FileWriter(""+14+".doc"));
	String desknum=new String(v14);
	
	
	bw.write(desknum+"\n");

	bw.close();
	dos.close();
	br.close();



} catch (FileNotFoundException e1) {
// TODO Auto-generated catch block
e1.printStackTrace();
} catch (IOException e1) {
// TODO Auto-generated catch block
e1.printStackTrace();
}
try {




	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	DataOutputStream dos=new DataOutputStream(new FileOutputStream(""+15+".doc"));
	BufferedWriter bw = new BufferedWriter(new FileWriter(""+15+".doc"));
	String desknum=new String(v15);
	
	
	bw.write(desknum+"\n");

	bw.close();
	dos.close();
	br.close();



} catch (FileNotFoundException e1) {
// TODO Auto-generated catch block
e1.printStackTrace();
} catch (IOException e1) {
// TODO Auto-generated catch block
e1.printStackTrace();
}
try {




	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	DataOutputStream dos=new DataOutputStream(new FileOutputStream(""+16+".doc"));
	BufferedWriter bw = new BufferedWriter(new FileWriter(""+16+".doc"));
	String desknum=new String(v16);
	
	
	bw.write(desknum+"\n");

	bw.close();
	dos.close();
	br.close();



} catch (FileNotFoundException e1) {
// TODO Auto-generated catch block
e1.printStackTrace();
} catch (IOException e1) {
// TODO Auto-generated catch block
e1.printStackTrace();
}
try {




	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	DataOutputStream dos=new DataOutputStream(new FileOutputStream(""+17+".doc"));
	BufferedWriter bw = new BufferedWriter(new FileWriter(""+17+".doc"));
	String desknum=new String(v17);
	
	
	bw.write(desknum+"\n");

	bw.close();
	dos.close();
	br.close();



} catch (FileNotFoundException e1) {
// TODO Auto-generated catch block
e1.printStackTrace();
} catch (IOException e1) {
// TODO Auto-generated catch block
e1.printStackTrace();
}
try {




	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	DataOutputStream dos=new DataOutputStream(new FileOutputStream(""+18+".doc"));
	BufferedWriter bw = new BufferedWriter(new FileWriter(""+18+".doc"));
	String desknum=new String(v18);
	
	
	bw.write(desknum+"\n");

	bw.close();
	dos.close();
	br.close();



} catch (FileNotFoundException e1) {
// TODO Auto-generated catch block
e1.printStackTrace();
} catch (IOException e1) {
// TODO Auto-generated catch block
e1.printStackTrace();
}
try {




	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	DataOutputStream dos=new DataOutputStream(new FileOutputStream(""+19+".doc"));
	BufferedWriter bw = new BufferedWriter(new FileWriter(""+19+".doc"));
	String desknum=new String(v19);
	
	
	bw.write(desknum+"\n");

	bw.close();
	dos.close();
	br.close();



} catch (FileNotFoundException e1) {
// TODO Auto-generated catch block
e1.printStackTrace();
} catch (IOException e1) {
// TODO Auto-generated catch block
e1.printStackTrace();
}
try {




	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	DataOutputStream dos=new DataOutputStream(new FileOutputStream(""+20+".doc"));
	BufferedWriter bw = new BufferedWriter(new FileWriter(""+20+".doc"));
	String desknum=new String(v20);
	
	
	bw.write(desknum+"\n");

	bw.close();
	dos.close();
	br.close();



} catch (FileNotFoundException e1) {
// TODO Auto-generated catch block
e1.printStackTrace();
} catch (IOException e1) {
// TODO Auto-generated catch block
e1.printStackTrace();
}


















	}
}
