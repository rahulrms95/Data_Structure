package com.interview.questions;

import java.util.ArrayList;
import java.util.List;

public class StockProblem {

	public static int maxProfit(final List<Integer> A) {

		//System.out.println(A.size());
		if(A.size() == 0)
		{
			return 0;
		}
		int maxVal1 = Integer.MIN_VALUE;
		int maxIndex = -1;
		for(int i=A.size()-1;i>=0;i--)
		{
			if(maxVal1<A.get(i))
			{
				maxVal1 = A.get(i);
				maxIndex = i;
			}
		}
		int minVal = Integer.MAX_VALUE;
		for(int i=0;i<maxIndex;i++)
		{
			if(minVal > A.get(i))
			{
				minVal = A.get(i);
			}
		}


		int minVal2 = Integer.MAX_VALUE;
		int minIndex = -1;
		for(int i=0;i<A.size();i++)
		{
			if(minVal2>A.get(i))
			{
				minVal2 = A.get(i);
				minIndex = i;
			}
		}
		int maxVal2 = Integer.MIN_VALUE;
		for(int i=minIndex;i<A.size();i++)
		{
			if(maxVal2 < A.get(i))
			{
				maxVal2 = A.get(i);
			}
		}


		return Math.max((maxVal1-minVal),(maxVal2-minVal2));
	}

	public static void main(String[] args) {

		int nums[] = { 2818230, 7403984, 4351468, 1421487, 7605160, 5208496, 7531934, 4591458, 7651855,
				250947, 1336131, 5549968, 2745934, 6573497, 9601143, 8224571, 9244066, 1620843, 4761506,
				5727354, 4182190, 8865163, 7279869, 9216523, 252942, 3202398, 2290997, 8091757, 9569131, 
				3906656, 7358869, 7619990, 276018, 4214248, 4699020, 3751510, 9494811, 5614974, 2330383, 
				4920447, 8233233, 5771379, 5387271, 5247002, 2798851, 4580226, 7126123, 9223141, 4360720,
				952654, 5278877, 7601049, 9172042, 7172999, 3446110, 9529759, 5656352, 9906602, 1464921,
				951934, 4423815, 3526455, 6026490, 5307933, 4637603, 3149180, 7678108, 6408158, 1823554,
				7322846, 8179280, 8130526, 385824, 7905978, 2528980, 3322491, 2173099, 1749406, 466934,
				3497518, 2739495, 6008331, 1030524, 61846, 986089, 1045022, 8830845, 1534615, 9536254, 
				9237340, 9203353, 5197059, 1184860, 2402093, 1838211, 7757451, 901528, 6212943, 5456136, 
				370866, 9865290, 3604544, 6866099, 7024190, 7613244, 7012449, 3873551, 9802651, 6650714,
				6846584, 3903872, 7449458, 4120761, 6225790, 1670137, 1636815, 8512682, 2874798, 162065,
				5390874, 3101607, 5958315, 2873041, 4223444, 5038522, 5058074, 2864072, 8164895, 7430173,
				4424115, 2841038, 7619274, 7468778, 6757339, 108147, 5839529, 808426, 4566513, 985850, 
				4713855, 646205, 9911747, 3246726, 5291818, 4295981, 1374528, 7622505, 8334748, 8698645,
				7519585, 4076941, 7723323, 5028998, 3115865, 5027729, 6919530, 2423739, 1370013, 2690390,
				5924645, 4704505, 4274201, 9860863, 2821846, 4857089, 7291811, 9717035, 2957715, 7363440, 3407464, 
				2234964, 3441937, 9099661, 3342443, 169947, 3536322, 6581953, 9701320, 143325, 1882758, 
				4880942, 178333, 2103903, 3763435, 3804034, 160351, 6080523, 2814093, 71285, 1732979, 
				6398174, 4231145, 374785, 7063725, 6381409, 6083702, 4702676, 771579, 3591131, 6062420, 
				4849287, 7053875, 8069854, 1089340, 92121, 7503669, 732798, 1086717, 2385481, 6348071, 
				2838100, 824881, 7061849, 8141478, 9618819, 3285272, 5294837, 6847448, 205254, 5804693,
				9003329, 4499343, 7167299, 1949312, 4724105, 5208013, 9855698, 2330204, 1439447, 8770858, 
				1172745, 9055583, 2756453, 8234567, 660042, 3740379, 2183230, 5256275, 5144704, 6773318,
				2344280, 6351061, 7479950, 3837132, 9495498, 2293127, 5499529, 4600028, 7980115, 6916329, 
				165008, 4977094, 5989391, 6978460, 8974382, 3002467, 369490, 7358457, 3427519, 6690527, 
				2484554, 6894055, 4118013, 5706063, 3201441, 6617635, 3534067, 9394384, 5786754, 5691447, 
				5352500, 3048717, 5016373, 1197785, 4973348, 4547020, 2090052, 8895072, 9837158, 6370140, 
				5378049, 7527634, 3807007, 3595608, 4426079, 91857, 6093128, 2916780, 320446, 6581474,
				5063989, 9011690, 2855805, 1032578, 6332948, 6940558, 4742373, 9205363, 2275906, 4101239,
				4319632, 8017584, 273243, 306840, 2030888, 725886, 2099294, 5974877, 5834917, 5105295,
				4665592, 889855, 5218209, 2674885, 5154083, 5713744, 4726731, 1325599, 4800337, 3111719, 
				3178669, 4723711, 4012295, 1580604, 8341477, 725012, 2695556, 6844029, 4430042, 3229941, 
				988497, 4751443, 545910, 2860429, 6348012, 4037558, 8846204, 7297396, 6641236, 8446508,
				8644471, 9215112, 4788741, 2723132, 5538175, 8813487, 1462433, 9995385, 994472, 6566679, 
				9050630, 3783874, 8544424, 4582403, 4930326, 4177348, 9799972, 7800609, 3022793, 4713768,
				7907017, 5540915, 9554864, 6435506, 896576, 5538647, 5082695, 5128707, 2957679, 5868123,
				9693039, 8472225, 6032795, 919951, 832968, 100981, 5554412, 7669117, 551405, 616904, 2992569, 
				5468854, 1807976, 1347383, 6589893, 7722647, 5385991, 9050626, 9536384, 5461851, 222798, 
				8057883, 4815847, 4438863, 5578904, 5598404, 9891041, 8151085, 2268410, 7318330, 8092224, 
				6024578, 9790340, 7812178, 8291610, 5581711, 9718533, 2229029, 2477034, 9081398, 5002812, 
				4346005, 6694790, 7067074, 4061467, 8959420, 4090118, 8716593, 3707959, 7926725, 1370824, 
				7149519, 7424369, 4113675, 1403883, 7695160, 6592368, 3886945, 9427735, 8925744, 7176769, 
				9749169, 1339101, 6271186, 957137, 5547734, 5082659, 4848758, 3386939, 8935019, 5468194, 
				6442874, 396444, 5954756, 687810, 6072404, 8555928, 2442260, 2412764, 2517499, 453564, 
				1845066, 6615528, 3431520, 2627738, 7715009, 2741654, 5800083, 478968, 9251990, 2995142,
				5803195, 9639400, 7998957, 8013719, 1606479, 497328, 1032644, 5004691, 7443000, 7183249,
				8148579, 1163167, 6684732, 661682, 9585333, 9448812, 7322890, 2000123, 871741, 273085, 530397, 
				2906894, 575186, 2556814, 9433785, 5770832, 5837737, 3802230, 4291063, 2130932, 6793816,
				5785814, 6657700, 2959074, 2665495, 9000064, 6094831, 3227013, 4509619, 526613, 7645518,
				2940566, 4217142, 2177934, 6718959, 844680, 9553335, 1069491, 4764705, 8222745, 2734749,
				6040044, 9371270, 1968993, 757608, 8540893, 2689715, 4223815, 3649825, 2470767, 6158455,
				5434537, 3919068, 2965045, 7888337, 7847468, 373265, 3297223, 3608097, 1240562, 6921819,
				4811336, 6694914, 8260877, 9230285, 3687095, 1359942, 1855636, 557784, 2395724, 3811953,
				4470339, 3760941, 911677, 1477370, 476750, 9690382, 2539050, 7228163, 9782933, 7478784,
				9347698, 2559260, 9862494, 9552852, 4578014, 6149106, 1866575, 7141552, 2276642, 5820590, 
				2261020, 978370, 8408520, 8964851, 1096442, 106023, 4923887, 3403126, 5115334, 7810976,
				1294157, 5882149, 179810, 573943, 5342822, 1667567, 7583568, 8757906, 780710, 4176770, 
				2375601, 2461778, 8315516, 4723632, 1530786, 3929497, 3917918, 1322702, 2789462, 757308, 
				8575710, 5685342, 5477788, 3122238, 3586979, 8950164, 8586154, 94485, 8002454, 4946044, 
				4998138, 3739685, 9837965, 7502652, 8833439, 9969221, 8021000, 9233204, 6570880, 7250314,
				5039647, 5893527, 9211984, 2038397, 6511919, 8877455, 752764, 2499203, 2480176, 1827374, 
				6804769, 4470847, 8296687, 3163524, 8874133, 9432065, 5051656, 2651853, 6607048, 5180658,
				5146566, 8749158, 6190608, 7370819, 4725295, 2562160, 7565474, 1773015, 7379799, 9654350, 
				3364795, 3795953, 9413132, 7710802, 555359, 8133311, 7874918, 4573823, 7227227, 3339370,
				8522042, 489579, 9935953, 9782434, 4131616, 9138304, 2366952, 5317914, 5917916, 5317929, 
				3499620, 2579954, 8470950, 4696093, 2445404, 8458527, 7087512, 1835382, 2935682, 2248203,
				7257377, 4250632, 7800541, 1438373, 1935509, 4609858, 6428077, 5889942, 2040230, 9284119,
				6927789, 3755695, 8230016, 5061658, 6126861, 8381613, 1699422, 5695729, 3759795, 3020058,
				6432333, 3620590, 3494078, 2670738, 9851169, 2209099, 36514, 7993830, 6147331, 3844898, 
				638243, 5498655, 7774470, 6049962, 5737976, 3209282, 5319973, 105807, 280480, 3038014,
				2908996, 7204697, 8416417, 1542666, 9919925, 7490193, 8545176, 8203752, 7675473, 6455813,
				4448974, 2991507, 1087872, 6340322, 3220267, 7182228, 1731454, 2369584, 9670375, 3642037,
				3683497, 857753, 5176793, 6657855, 8351001, 6282716, 4981493, 6571767, 6725099, 2468176, 
				7829100, 1901985, 2510244, 6437379, 9140916, 9587833, 9121404, 4234250, 8288032, 8503387, 
				2295433, 7662906, 3314685, 6674184, 594622, 850719, 338585, 4470123, 1345997, 9943784, 
				3209176, 6711988, 8931282, 5508895, 2702366, 1926067, 8944293, 9850655, 8082451, 4138907, 
				6755045, 6297924, 7076881, 2122868, 3453252, 9719174, 1639503, 9944786, 9779515, 1960043,
				8376785, 1027781, 5826218, 5046451, 8909752, 4397042, 9906586, 8642050, 3626505, 7714116, 
				5572543, 7295667, 5089588, 9524314, 6425538, 2357711, 9083569, 7218322, 6908219, 895357, 
				1754135, 1788977, 4198073, 647968, 7933619, 5249473, 1063166, 4605675, 3810108, 9335994, 
				9797533, 3124844, 504744, 3979040, 3732193, 8843017, 621547, 4440684, 8584575, 4740994, 
				9828449, 3294772, 5526089, 3369810, 8524988, 9082123, 3326337, 907245, 3784194, 2522459,
				6603118, 9368820, 3075533, 1710630, 1398165, 555428, 3572260, 4385406, 1344849, 7088684,
				2214393, 9872026, 3697757, 8211255, 1795972, 7606984, 1389704, 6540277, 2727691, 7262417,
				8988907, 5583647, 5848156, 5918842, 4294431, 3101607, 6755965, 3509889, 8645854, 6639453,
				6699494, 3573234, 49993, 3908980, 8106248, 2763237, 85998, 3968038, 3186302, 1053340, 4235749, 
				780712, 9225689, 3833342, 5023150, 3109621, 5333018, 1434513, 2137412, 3032764, 4432590, 6735382, 
				9327359, 7192059, 9275350, 8780180, 6803486, 1452435, 9049344, 6627394, 76520, 4849361, 4295383, 
				2631532, 2990622, 2745628, 8311828, 100024, 4184536, 8177940, 9556529, 9434463, 7258198, 8227231,
				8640883, 8377443, 159206, 1673761, 5780546, 2747022, 6701259, 2586986, 7246750, 9001054, 3500800, 
				8471615, 5246367, 3992375, 3495200, 9895105, 9333789, 2738101, 5458438, 4849705, 6663769, 6826715,
				7589716, 5702826, 6274231, 3767533, 9389116, 1403529, 916829, 7262593, 6219422, 9983974, 2862701, 
				1592837, 5666794, 7123802, 8642624, 8853795, 2472804, 1284575, 6439574, 5203624, 2645951, 469259,
				7791367, 3094928, 8093298, 9385093, 1142794, 8935348, 9960382, 1754016, 586594, 18567, 3239903, 
				2839742, 6881502, 8689227, 1631401, 2209794, 4620661, 9117227, 8187461, 3848443, 7634484, 9690001
				};
		
		List<Integer> lst = new ArrayList<Integer>();
		
		System.out.println(nums.length);
		for(int i=0;i<nums.length;i++)
		{
		//	lst.add(nums[i]);
		}
		//System.out.println("Total profit :  "+maxProfit(lst));

		int arr1[] = { 7551982, 8124939, 4023780, 7868369, 4412570, 2542961, 7380261, 1164290, 7781065, 
				1164599, 2563492, 5354415, 4994454, 2627136, 5933501, 668219, 1821804, 7818378, 33654,
				4167689, 8652323, 5750640, 9822437, 3466466, 554089, 6168826, 335687, 2466661, 8511732,
				6288553, 2905889, 7747975, 3744045, 1545003, 1008624, 8041203, 7176125, 4321092, 714053,
				7200073, 166697, 7814651, 3090485, 8318668, 6600364, 3352620, 2430137, 7685821, 1442555,
				828955, 6540266, 5305436, 116568, 1883410, 7975347, 9629015, 4735259, 6559041, 1832532,
				5840170, 6983732, 5886179, 1496505, 7241412, 144558, 9462840, 8579314, 2488436, 9677478,
				7589124, 5636642, 2440601, 1767332, 2399786, 6299635, 8534665, 1367339, 805592, 5572668, 
				6990026, 8465261, 4808596, 7641452, 8464860, 3170126, 7403200, 6932907, 3776122, 1313688,
				3992189, 2382116, 3886952, 349816, 1596435, 7353742, 9964868, 9882224, 3818546, 3885458, 
				1200559, 3910256, 7949895, 463872, 6392805, 9513226, 3427933, 3470571, 6225817, 552452,
				5567651, 6414423, 6701681, 4725847, 894529, 8046603, 426263, 5280891, 9197661, 9764507, 
				1740413, 9530261, 9163599, 7561587, 5848442, 7312422, 4794268, 5793465, 5039382, 5147388,
				7346933, 4697363, 6436473, 5159752, 2207985, 8256403, 8958858, 6099618, 2172252, 3063342,
				4324166, 3919237, 8985768, 2703255, 2386343, 3064166, 247762, 7271683, 1812487, 7163753, 
				4635382, 449426, 2561592, 3746615, 8741199, 6696192, 606265, 5374062, 3065308, 6918398, 
				2956279, 8949324, 2804580, 3421479, 7846658, 8895839, 8277589, 1262596, 451779, 9972218, 
				6378556, 4216958, 7127258, 8593578, 326883, 4737513, 6578257, 7582654, 8675499, 9038961,
				7902676, 8874020, 5513073, 631930, 912719, 8394492, 1508363, 455175, 9215635, 6813970, 
				2021710, 5673212, 184474, 4511247, 4653238, 2218883, 9669544, 295018, 3694660, 1709444, 
				4019025, 5047809, 45740, 1035395, 8159408, 1557286, 1304144, 6496263, 2094202, 9945315, 
				1905585, 1143081, 6994125, 9609830, 1077628, 3488222, 6299366, 7187139, 3883908, 7077292,
				3210807, 7328762, 7695314, 1138834, 7689433, 5083719, 202831, 8138452, 5495064, 7543763, 
				1597085, 5429837, 8455839, 6925605, 6600884, 3571512, 3422637, 8911245, 3700762, 2338168, 
				6830853, 2539094, 490627, 2294717, 497349, 8297867, 7299269, 4769134, 285033, 4335917, 
				9908413, 152868, 2658658, 3525848, 1884044, 4953877, 8660374, 8989154, 888731, 7217408, 
				2614940, 7990455, 9779818, 1441488, 9605891, 4518756, 3705442, 9331226, 404585, 9011202,
				7355000, 7461968, 6512552, 2689841, 2873446, 256454, 1068037, 8786859, 2323599, 3332506,
				2361155, 7476810, 5605915, 5950352, 6491737, 8696129, 4637800, 4207476, 9334774, 840248, 
				9159149, 5201180, 7211332, 3135016, 8524857, 4566111, 7697488, 1833291, 7227481, 8289951,
				2389102, 9102789, 8585135, 1869227, 4082835, 8447466, 4985240, 4176179 };

		//int arr1[] = {4,3,1,7,9,0,7,6,5,10};
		//int[] arr1 = {5,3,2};
		System.out.println(arr1.length);
		for(int i=0;i<arr1.length;i++)
		{
			lst.add(arr1[i]);
		}


		System.out.println("Total profit :  "+getMaximumProfit(lst));

	}

	public static long getMaximumProfit(List<Integer> prices)
	{
		int[] arr =new int[prices.size()];
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = prices.get(i);
		}
		long profit = 0;
		int buy = 0;
		int sell = 0;
		int i = 1;
		while(i<arr.length)
		{
			
			while(i<arr.length && arr[i]<arr[buy])
			{
				buy = i;
				i++;
			}
			sell = buy;
			while(i<arr.length && arr[i]>arr[sell])
			{
				sell = i;
				i++;
			}

			if(sell>buy)
			{
				profit += arr[sell]-arr[buy];
				//System.out.println("Buy at "+arr[buy] +" "+ buy + " sell at "+sell + " Profit "+(arr[sell]-arr[buy]));
			}
			if(i<arr.length)
			{
				buy = i;
				sell = i;
				i++;
			}

		}

		return profit;
	}
}
