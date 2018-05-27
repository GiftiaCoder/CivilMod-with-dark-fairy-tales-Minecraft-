package poi.giftiacoder.civil_mod.algo;

public interface Primzahl {

	public static final int[] PRIMZAHLS = new int[] {
			30011,30013,30029,30047,30059,30071,30089,30091,30097,30103,30109,30113,30119,30133,30137,30139,
			30161,30169,30181,30187,30197,30203,30211,30223,30241,30253,30259,30269,30271,30293,30307,30313,
			30319,30323,30341,30347,30367,30389,30391,30403,30427,30431,30449,30467,30469,30491,30493,30497,
			30509,30517,30529,30539,30553,30557,30559,30577,30593,30631,30637,30643,30649,30661,30671,30677,
			30689,30697,30703,30707,30713,30727,30757,30763,30773,30781,30803,30809,30817,30829,30839,30841,
			30851,30853,30859,30869,30871,30881,30893,30911,30931,30937,30941,30949,30971,30977,30983,31013,
			31019,31033,31039,31051,31063,31069,31079,31081,31091,31121,31123,31139,31147,31151,31153,31159,
			31177,31181,31183,31189,31193,31219,31223,31231,31237,31247,31249,31253,31259,31267,31271,31277,
			31307,31319,31321,31327,31333,31337,31357,31379,31387,31391,31393,31397,31469,31477,31481,31489,
			31511,31513,31517,31531,31541,31543,31547,31567,31573,31583,31601,31607,31627,31643,31649,31657,
			31663,31667,31687,31699,31721,31723,31727,31729,31741,31751,31769,31771,31793,31799,31817,31847,
			31849,31859,31873,31883,31891,31907,31957,31963,31973,31981,31991,32003,32009,32027,32029,32051,
			32057,32059,32063,32069,32077,32083,32089,32099,32117,32119,32141,32143,32159,32173,32183,32189,
			32191,32203,32213,32233,32237,32251,32257,32261,32297,32299,32303,32309,32321,32323,32327,32341,
			32353,32359,32363,32369,32371,32377,32381,32401,32411,32413,32423,32429,32441,32443,32467,32479,
			32491,32497,32503,32507,32531,32533,32537,32561,32563,32569,32573,32579,32587,32603,32609,32611,
			32621,32633,32647,32653,32687,32693,32707,32713,32717,32719,32749,32771,32779,32783,32789,32797,
			32801,32803,32831,32833,32839,32843,32869,32887,32909,32911,32917,32933,32939,32941,32957,32969,
			32971,32983,32987,32993,32999,33013,33023,33029,33037,33049,33053,33071,33073,33083,33091,33107,
			33113,33119,33149,33151,33161,33179,33181,33191,33199,33203,33211,33223,33247,33287,33289,33301,
			33311,33317,33329,33331,33343,33347,33349,33353,33359,33377,33391,33403,33409,33413,33427,33457,
			33461,33469,33479,33487,33493,33503,33521,33529,33533,33547,33563,33569,33577,33581,33587,33589,
			33599,33601,33613,33617,33619,33623,33629,33637,33641,33647,33679,33703,33713,33721,33739,33749,
			33751,33757,33767,33769,33773,33791,33797,33809,33811,33827,33829,33851,33857,33863,33871,33889,
			33893,33911,33923,33931,33937,33941,33961,33967,33997,34019,34031,34033,34039,34057,34061,34123,
			34127,34129,34141,34147,34157,34159,34171,34183,34211,34213,34217,34231,34253,34259,34261,34267,
			34273,34283,34297,34301,34303,34313,34319,34327,34337,34351,34361,34367,34369,34381,34403,34421,
			34429,34439,34457,34469,34471,34483,34487,34499,34501,34511,34513,34519,34537,34543,34549,34583,
			34589,34591,34603,34607,34613,34631,34649,34651,34667,34673,34679,34687,34693,34703,34721,34729,
			34739,34747,34757,34759,34763,34781,34807,34819,34841,34843,34847,34849,34871,34877,34883,34897,
			34913,34919,34939,34949,34961,34963,34981,35023,35027,35051,35053,35059,35069,35081,35083,35089,
			35099,35107,35111,35117,35129,35141,35149,35153,45053,45061,45077,45083,45119,45121,45127,45131,
			35159,35171,35201,35221,35227,35251,35257,35267,35279,35281,35291,35311,35317,35323,35327,35339,
			35353,35363,35381,35393,35401,35407,35419,35423,35437,35447,35449,35461,35491,35507,35509,35521,
			35527,35531,35533,35537,35543,35569,35573,35591,35593,35597,35603,35617,35671,35677,35729,35731,
			35747,35753,35759,35771,35797,35801,35803,35809,35831,35837,35839,35851,35863,35869,35879,35897,
			35899,35911,35923,35933,35951,35963,35969,35977,35983,35993,35999,36007,36011,36013,36017,36037,
			36061,36067,36073,36083,36097,36107,36109,36131,36137,36151,36161,36187,36191,36209,36217,36229,
			36241,36251,36263,36269,36277,36293,36299,36307,36313,36319,36341,36343,36353,36373,36383,36389,
			36433,36451,36457,36467,36469,36473,36479,36493,36497,36523,36527,36529,36541,36551,36559,36563,
			36571,36583,36587,36599,36607,36629,36637,36643,36653,36671,36677,36683,36691,36697,36709,36713,
			36721,36739,36749,36761,36767,36779,36781,36787,36791,36793,36809,36821,36833,36847,36857,36871,
			36877,36887,36899,36901,36913,36919,36923,36929,36931,36943,36947,36973,36979,36997,37003,37013,
			37019,37021,37039,37049,37057,37061,37087,37097,37117,37123,37139,37159,37171,37181,37189,37199,
			37201,37217,37223,37243,37253,37273,37277,37307,37309,37313,37321,37337,37339,37357,37361,37363,
			37369,37379,37397,37409,37423,37441,37447,37463,37483,37489,37493,37501,37507,37511,37517,37529,
			37537,37547,37549,37561,37567,37571,37573,37579,37589,37591,37607,37619,37633,37643,37649,37657,
			37663,37691,37693,37699,37717,37747,37781,37783,37799,37811,37813,37831,37847,37853,37861,37871,
			37879,37889,37897,37907,37951,37957,37963,37967,37987,37991,37993,37997,38011,38039,38047,38053,
			38069,38083,38113,38119,38149,38153,38167,38177,38183,38189,38197,38201,38219,38231,38237,38239,
			38261,38273,38281,38287,38299,38303,38317,38321,38327,38329,38333,38351,38371,38377,38393,38431,
			38447,38449,38453,38459,38461,38501,38543,38557,38561,38567,38569,38593,38603,38609,38611,38629,
			38639,38651,38653,38669,38671,38677,38693,38699,38707,38711,38713,38723,38729,38737,38747,38749,
			38767,38783,38791,38803,38821,38833,38839,38851,38861,38867,38873,38891,38903,38917,38921,38923,
			38933,38953,38959,38971,38977,38993,39019,39023,39041,39043,39047,39079,39089,39097,39103,39107,
			39113,39119,39133,39139,39157,39161,39163,39181,39191,39199,39209,39217,39227,39229,39233,39239,
			39241,39251,39293,39301,39313,39317,39323,39341,39343,39359,39367,39371,39373,39383,39397,39409,
			39419,39439,39443,39451,39461,39499,39503,39509,39511,39521,39541,39551,39563,39569,39581,39607,
			39619,39623,39631,39659,39667,39671,39679,39703,39709,39719,39727,39733,39749,39761,39769,39779,
			39791,39799,39821,39827,39829,39839,39841,39847,39857,39863,39869,39877,39883,39887,39901,39929,
			39937,39953,39971,40031,40037,40039,40063,40087,40093,40099,40111,40123,40127,40129,40151,40153,
			40163,40169,40177,40189,40193,40213,40231,40237,40241,40253,40277,40283,40289,40343,40351,40357,
			40361,40387,40423,40427,40429,40433,40459,40471,40483,40487,40493,40499,40507,40519,40529,40531,
			40543,40559,40577,40583,40591,40597,40609,40627,40637,40639,40693,40697,40699,40709,40739,40751,
	};
	
}
