import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class StarterCode {
   
    public static void main(String[] args) {
        // read input from a file into an array
        // change the filename as needed
        int[] lines = readIntsFromFile("rightSide.txt");
        System.out.println("\n\n\n");
        // for (int line: lines) {
        //     System.out.println(line);
        // }


        // Not much of a need to edit anything down here
        // Here is where your methods actually run and return their results!
        System.out.println(partOne(lines));
        System.out.println(partTwo(lines));
    }


// -------------------------------------------------------------------------------------- //




    // TODO: Complete Part One!
    public static int partOne(int[] lines) {
        // Create a new array to store the sorted version of 'lines'
        int sum = 0;
        int[] sortedLeft = {10006, 10164, 10186, 10190, 10209, 10313, 10418, 10526, 10571, 10766, 10825, 10838, 10892, 10980, 11062, 11273, 11278, 11411, 11519, 11522, 11814, 11876, 11879, 11883, 11887, 11907, 11950, 11959, 12018, 12241, 12300, 12479, 12762, 12807, 12873, 12936, 12937, 13200, 13223, 13233, 13293, 13403, 13510, 13550, 13554, 13592, 13646, 13811, 13820, 13841, 13960, 14025, 14077, 14111, 14123, 14207, 14585, 14655, 14803, 14979, 15215, 15233, 15248, 15369, 15585, 15737, 15788, 15982, 16125, 16210, 16242, 16375, 16487, 16557, 16839, 16857, 16970, 17009, 17066, 17092, 17187, 17713, 17744, 17757, 18053, 18076, 18158, 18185, 18231, 18301, 18371, 18390, 18518, 18609, 18670, 18732, 18912, 18983, 19040, 19101, 19107, 19189, 19335, 19404, 19512, 19586, 19797, 19816, 19900, 20043, 20096, 20171, 20247, 20341, 20352, 20426, 20473, 20616, 20645, 20661, 20858, 20971, 21002, 21224, 21522, 21526, 21597, 21745, 21762, 21766, 21860, 21873, 21923, 22296, 22532, 22543, 22587, 22832, 22936, 23027, 23069, 23142, 23150, 23174, 23262, 23400, 23402, 23437, 23458, 23460, 23497, 23507, 23577, 23620, 23734, 23863, 23871, 23898, 23921, 24111, 24255, 24436, 24444, 24726, 24815, 24909, 24928, 24957, 24972, 25031, 25055, 25101, 25136, 25217, 25311, 25536, 25598, 25734, 25749, 25750, 25775, 25788, 25871, 25994, 25998, 26043, 26105, 26139, 26154, 26162, 26163, 26186, 26244, 26251, 26355, 26562, 26794, 26912, 27276, 27531, 27722, 27789, 27889, 27982, 28063, 28083, 28110, 28114, 28174, 28394, 28435, 28564, 28659, 28786, 28837, 28905, 28988, 29046, 29326, 29419, 29431, 29605, 29688, 29852, 29914, 29917, 29939, 30246, 30332, 30406, 30472, 30619, 30688, 30760, 30874, 30924, 30945, 30980, 31068, 31093, 31210, 31341, 31388, 31695, 31806, 31815, 31830, 31839, 31853, 32018, 32058, 32061, 32091, 32127, 32215, 32235, 32514, 32604, 32705, 32725, 32915, 32971, 33067, 33113, 33138, 33174, 33383, 33523, 33542, 33575, 33767, 33771, 33803, 33936, 34081, 34098, 34169, 34224, 34410, 34461, 34464, 34597, 34633, 34659, 34710, 34830, 34839, 34896, 34909, 34931, 34995, 35004, 35115, 35136, 35159, 35166, 35222, 35298, 35348, 35359, 35406, 35479, 35570, 35576, 35680, 35898, 35929, 36023, 36067, 36136, 36385, 36447, 36612, 36665, 36872, 36927, 37000, 37065, 37079, 37180, 37228, 37264, 37309, 37359, 37402, 37494, 37503, 37673, 37699, 37749, 37882, 37912, 37979, 38007, 38143, 38199, 38451, 38548, 38669, 38775, 38801, 38922, 38951, 38976, 39036, 39113, 39163, 39289, 39333, 39335, 39390, 39544, 39556, 39618, 39634, 39749, 39844, 39874, 39926, 39998, 40047, 40065, 40109, 40121, 40255, 40280, 40505, 40798, 40843, 40997, 41048, 41068, 41130, 41137, 41146, 41196, 41305, 41396, 41593, 41598, 41611, 41620, 41636, 41645, 41883, 41958, 42012, 42092, 42170, 42325, 42579, 42783, 42786, 42958, 43236, 43387, 43545, 43577, 43606, 43743, 43886, 43911, 43947, 44034, 44335, 44458, 44522, 44562, 44594, 44642, 44764, 44817, 44922, 45148, 45199, 45203, 45270, 45298, 45484, 45646, 45806, 45835, 45853, 45913, 45943, 46102, 46354, 46401, 46490, 46514, 46780, 46869, 47137, 47312, 47400, 47465, 47516, 47639, 47704, 47748, 47751, 47771, 47900, 47978, 48009, 48125, 48171, 48317, 48331, 48401, 48651, 48702, 48768, 48804, 49126, 49194, 49366, 49438, 49611, 49612, 49639, 49784, 49831, 49885, 49947, 50050, 50113, 50169, 50403, 50561, 50601, 50603, 50640, 50646, 50651, 50882, 51189, 51534, 51579, 51617, 51623, 51669, 51754, 51805, 51869, 51903, 52036, 52339, 52340, 52422, 52443, 52504, 52619, 52642, 52733, 52763, 52812, 52958, 53092, 53133, 53134, 53147, 53148, 53190, 53415, 53459, 53651, 53861, 53944, 54008, 54066, 54119, 54179, 54418, 54422, 54482, 54561, 54669, 54675, 54711, 54847, 54935, 55015, 55216, 55269, 55365, 55374, 55465, 55740, 55841, 55868, 56088, 56231, 56304, 56360, 56369, 56440, 56567, 56644, 56645, 56743, 56779, 57155, 57295, 57354, 57385, 57423, 57426, 57483, 57542, 57650, 57724, 57886, 58119, 58293, 58295, 58377, 58496, 58577, 58613, 58692, 58698, 58705, 58773, 58775, 58835, 58950, 58996, 59032, 59165, 59257, 59569, 59643, 60682, 60775, 60832, 60960, 61188, 61241, 61256, 61275, 61317, 61384, 61519, 61562, 61611, 61630, 61747, 61882, 61899, 61936, 61949, 61975, 62108, 62155, 62212, 62222, 62285, 62303, 62306, 62376, 62415, 62441, 62487, 62645, 62722, 62744, 62886, 63046, 63172, 63247, 63352, 63422, 63911, 63914, 63979, 64135, 64266, 64278, 64333, 64442, 64470, 64581, 64743, 64921, 65101, 65300, 65491, 65729, 65746, 65936, 65978, 66080, 66106, 66314, 66336, 66344, 66544, 66822, 67045, 67110, 67152, 67201, 67251, 67395, 67459, 67472, 67527, 67646, 68166, 68167, 68244, 68311, 68371, 68467, 68659, 68715, 68726, 69012, 69148, 69340, 69477, 69645, 69764, 70044, 70063, 70163, 70197, 70201, 70253, 70325, 70393, 70625, 70745, 70752, 70817, 70854, 70892, 70907, 70943, 70988, 71026, 71318, 71325, 71330, 71427, 71651, 71721, 71851, 71888, 71958, 71962, 71980, 72110, 72153, 72185, 72241, 72473, 72503, 72660, 72690, 72744, 72802, 73040, 73067, 73351, 73759, 73885, 74157, 74251, 74290, 74340, 74624, 74662, 74862, 74955, 74971, 75164, 75200, 75267, 75290, 75305, 75565, 75606, 75620, 75926, 75978, 76238, 76273, 76362, 76399, 76536, 76573, 76587, 76703, 77123, 77157, 77222, 77241, 77417, 77477, 77502, 77593, 77678, 77771, 77848, 77929, 78168, 78216, 78393, 78705, 78901, 78924, 79021, 79089, 79108, 79184, 79411, 79413, 79546, 79565, 79572, 79657, 79794, 79833, 79910, 79961, 80049, 80130, 80176, 80334, 80436, 80448, 80471, 80596, 80705, 80869, 81081, 81197, 81387, 81489, 81556, 81598, 81693, 81838, 81878, 81957, 81975, 81984, 82010, 82021, 82187, 82269, 82324, 82440, 82498, 82553, 82672, 82677, 82711, 82841, 82922, 83001, 83096, 83210, 83312, 83437, 83666, 83669, 83701, 83754, 83822, 83974, 84094, 84099, 84281, 84349, 84391, 84499, 84518, 84626, 84634, 84704, 84769, 84826, 85116, 85125, 85143, 85251, 85362, 85368, 85411, 85522, 85585, 85590, 85735, 85808, 85923, 85961, 86000, 86060, 86152, 86221, 86307, 86367, 86437, 86439, 86650, 86815, 86836, 86928, 87004, 87067, 87100, 87334, 87344, 87552, 87598, 87645, 87822, 87856, 87909, 87924, 88067, 88161, 88173, 88272, 88382, 88390, 88399, 88420, 88743, 88888, 88960, 89050, 89131, 89204, 89248, 89279, 89370, 89406, 89612, 89734, 89800, 90008, 90291, 90383, 90388, 90404, 90435, 90697, 90698, 90755, 90860, 90977, 90995, 91064, 91199, 91232, 91248, 91540, 91557, 91611, 91631, 91663, 91704, 91844, 91871, 92381, 92522, 92648, 92678, 92979, 93111, 93218, 93370, 93419, 93477, 93528, 93662, 93745, 93775, 93790, 93874, 94136, 94234, 94441, 94592, 94698, 94750, 94829, 94912, 95079, 95123, 95143, 95350, 95361, 95481, 95590, 95606, 95632, 95805, 95867, 95898, 95965, 95976, 96019, 96021, 96127, 96152, 96159, 96196, 96277, 96305, 96308, 96412, 96545, 96622, 96781, 96930, 97072, 97132, 97334, 97382, 97439, 97511, 97617, 97638, 97642, 97780, 97799, 97836, 97885, 98077, 98095, 98114, 98177, 98181, 98238, 98257, 98388, 98506, 98705, 98781, 98791, 98874, 98955, 98975, 99101, 99197, 99274, 99381, 99427, 99451, 99452, 99510, 99696, 99872, 99894, 99941};
       int[] sortedRight = {10020, 10118, 10294, 10360, 10376, 10380, 10418, 10418, 10418, 10418, 10418, 10418, 10418, 10418, 10418, 10418, 10418, 10418, 10707, 10972, 11177, 11239, 11382, 11473, 11566, 11626, 11799, 12031, 12036, 12246, 12302, 12440, 12692, 12762, 12762, 12762, 12762, 12762, 12762, 12762, 12847, 12892, 13269, 13386, 13421, 13483, 13514, 13569, 13849, 14008, 14030, 14131, 14141, 14573, 15026, 15170, 15403, 15704, 15747, 16006, 16165, 16352, 16487, 16487, 16487, 16487, 16487, 16487, 16487, 16487, 16487, 16557, 16557, 16557, 16557, 16557, 16557, 16557, 16557, 16557, 16557, 16557, 16557, 16557, 16557, 16557, 16557, 16557, 16557, 16688, 16735, 17170, 17235, 17490, 17664, 17765, 17822, 17823, 17968, 17977, 18104, 18265, 18396, 19340, 19518, 19783, 19816, 19816, 19816, 19816, 19816, 19900, 19900, 19900, 19900, 20123, 20364, 20372, 20638, 20670, 20839, 20886, 21065, 21106, 21152, 21202, 21216, 21470, 21612, 21873, 21873, 21873, 21873, 21873, 21873, 21873, 21873, 21873, 21873, 21873, 21873, 21873, 21873, 21873, 21873, 21873, 21873, 21873, 21942, 21970, 21993, 22002, 22219, 22401, 22415, 22536, 22620, 23126, 23188, 23460, 23460, 23460, 23460, 23460, 23460, 23460, 23460, 23460, 23460, 23460, 23460, 23460, 23477, 23569, 23751, 23827, 23835, 24056, 24110, 24323, 24607, 24788, 24957, 24957, 24957, 24957, 24957, 24957, 24957, 24957, 24957, 24957, 24957, 24957, 24957, 24957, 25342, 25421, 25454, 25522, 25710, 25736, 25803, 25976, 25994, 25994, 25994, 26162, 26162, 26162, 26162, 26162, 26162, 26162, 26162, 26162, 26186, 26525, 26540, 26603, 26647, 26701, 26808, 27189, 27309, 27331, 27338, 27531, 27531, 27531, 27531, 27531, 27531, 27531, 27531, 27531, 27531, 27531, 27636, 27795, 27808, 27854, 28021, 28044, 28168, 28694, 29070, 29230, 29289, 29344, 29383, 29495, 29744, 29813, 29820, 29967, 30266, 30462, 30651, 30929, 31093, 31093, 31093, 31093, 31093, 31093, 31093, 31093, 31093, 31093, 31093, 31093, 31093, 31093, 31093, 31093, 31148, 31362, 31388, 31388, 31388, 31512, 31575, 31668, 31683, 31691, 31786, 31847, 31857, 31859, 31861, 31888, 32627, 32705, 32705, 32705, 32705, 32705, 32705, 32705, 32705, 32705, 32705, 32718, 32745, 32778, 32812, 32914, 32953, 33219, 33239, 33777, 34459, 34663, 34874, 35302, 35587, 35609, 35634, 35704, 35914, 36746, 36867, 37143, 37223, 37250, 37656, 37749, 37749, 37749, 37749, 37749, 37749, 37749, 37749, 37749, 37749, 37749, 37749, 37749, 37882, 37882, 38134, 38328, 38370, 38677, 38721, 38813, 38866, 39006, 39025, 39040, 39047, 40064, 40138, 40240, 40417, 40435, 40549, 40607, 40798, 40798, 40798, 40798, 40798, 40798, 40798, 40798, 40798, 40798, 40798, 40798, 40798, 40798, 40798, 40798, 40798, 40798, 40798, 40798, 40976, 41135, 41525, 41567, 41574, 41647, 42027, 42246, 42478, 42768, 42776, 42821, 42840, 42844, 42919, 43026, 43055, 43167, 43422, 43430, 43597, 43896, 43959, 43961, 44012, 44054, 44095, 44272, 44341, 44351, 44438, 44521, 44711, 45336, 45398, 45479, 45543, 45581, 45819, 45856, 45889, 46077, 46304, 46378, 46860, 47022, 47173, 47276, 47345, 47384, 47386, 47499, 48396, 48623, 48671, 48934, 48939, 49126, 49126, 49126, 49126, 49126, 49126, 49126, 49126, 49126, 49126, 49126, 49126, 49126, 49126, 49126, 49148, 49170, 49358, 49374, 49517, 49701, 50029, 50089, 50324, 50389, 50448, 50494, 50508, 50551, 50601, 50601, 50601, 50601, 50601, 50601, 50601, 50601, 50601, 50800, 50899, 51245, 51482, 51524, 51880, 52047, 52063, 52236, 52357, 52468, 52525, 52645, 52851, 53178, 53284, 53390, 53461, 53944, 53944, 53944, 53944, 53944, 53944, 53944, 53944, 53944, 53944, 53944, 53944, 53944, 53944, 53944, 53944, 53944, 53944, 54121, 54192, 54268, 54482, 54482, 54482, 54482, 54482, 54482, 54482, 54482, 54482, 54482, 54482, 54482, 54482, 54482, 54482, 54482, 54482, 54494, 54548, 54621, 54696, 54898, 55135, 55692, 55762, 55825, 56014, 56129, 56398, 56786, 56805, 56880, 57030, 57072, 57740, 57813, 57981, 58099, 58274, 58285, 58801, 58965, 59092, 59184, 59338, 59362, 59420, 59687, 60171, 60179, 60647, 60818, 60858, 61032, 61228, 61349, 61472, 61535, 61884, 61925, 61981, 62194, 62400, 62411, 62613, 62892, 63048, 63081, 63275, 63310, 63332, 63538, 63703, 63745, 63765, 64049, 64145, 64197, 64490, 64498, 64544, 64579, 64667, 64743, 64743, 64743, 64743, 64743, 64743, 64743, 64743, 64743, 64743, 64743, 64743, 64743, 64971, 65035, 65101, 65101, 65101, 65101, 65101, 65101, 65101, 65101, 65101, 65101, 65101, 65348, 65384, 65391, 65543, 65807, 66005, 66094, 66300, 66423, 66439, 66504, 66710, 66749, 66779, 66889, 67008, 67106, 67136, 67308, 67494, 67545, 67603, 67636, 67658, 67725, 67792, 67919, 67963, 68082, 68154, 68195, 68392, 68603, 68652, 68948, 68984, 69037, 69420, 69512, 69547, 69572, 69671, 70467, 70473, 70751, 70926, 70928, 71276, 71450, 71454, 71530, 71765, 71858, 72508, 72612, 72898, 72900, 73375, 73486, 74195, 74202, 74413, 74437, 74883, 74893, 74997, 75318, 75353, 75439, 75483, 75491, 75583, 75651, 75667, 75702, 75970, 76035, 76125, 76577, 76582, 76645, 76721, 76986, 77104, 77124, 77193, 77417, 77417, 77417, 77417, 77417, 77417, 77417, 77417, 77417, 77417, 77417, 77417, 77420, 77449, 77493, 77593, 77593, 77593, 77593, 77593, 77593, 77593, 77593, 77681, 77759, 77870, 77897, 77972, 78231, 78317, 78321, 78381, 78393, 78393, 78393, 78393, 78393, 78393, 78513, 78684, 78725, 78921, 79005, 79338, 79445, 79528, 79820, 79885, 80128, 80234, 80320, 80342, 80348, 80409, 80428, 80662, 80725, 80828, 81007, 81047, 81173, 81197, 81197, 81197, 81197, 81197, 81197, 81197, 81197, 81197, 81197, 81395, 81591, 81598, 81598, 81598, 81598, 81598, 81598, 81598, 81598, 81598, 81598, 81598, 81598, 81598, 81598, 81598, 81598, 81598, 81598, 81638, 81990, 82443, 82468, 82700, 82734, 82816, 83066, 83096, 83096, 83096, 83096, 83096, 83096, 83096, 83096, 83096, 83096, 83096, 83096, 83096, 83096, 83096, 83096, 83096, 83184, 83283, 83526, 83532, 83818, 83821, 84087, 84284, 84294, 84361, 84414, 84492, 84499, 84499, 84502, 84513, 84879, 85007, 85051, 85056, 85292, 85675, 85750, 85802, 85839, 85940, 85993, 86123, 86168, 86221, 86221, 86221, 86756, 86836, 87351, 87368, 87493, 87767, 88157, 88283, 88406, 88447, 88608, 88915, 89001, 89007, 89035, 89095, 89135, 89320, 89404, 89511, 89592, 89612, 89612, 89612, 89612, 89612, 89612, 89612, 89612, 89612, 89612, 89612, 89612, 89612, 89612, 89612, 89612, 89612, 89612, 89612, 89612, 90035, 90413, 90430, 90579, 90621, 90719, 90769, 90907, 91094, 91261, 91319, 91366, 91670, 91706, 91790, 91806, 91866, 92064, 92178, 92284, 92381, 92381, 92381, 92381, 92381, 92381, 92381, 92381, 92381, 92381, 92381, 92381, 92381, 92381, 92381, 92381, 92381, 92381, 92381, 92381, 92787, 93023, 93066, 93247, 93419, 93419, 93419, 93419, 93419, 93419, 93759, 93949, 93951, 93953, 94258, 94417, 94495, 94748, 95015, 95081, 95296, 95318, 95517, 95669, 95778, 95877, 96327, 96615, 96622, 96622, 96622, 96622, 96622, 96622, 96622, 96712, 96803, 97049, 97524, 97629, 97669, 97762, 98552, 98667, 98689, 98705, 98705, 98705, 98705, 98705, 98705, 98705, 98705, 98705, 98705, 98705, 99027, 99063, 99427, 99596, 99638, 99914};
        // Copy the contents of 'lines' to 'sortedLeft'
        for(int i = 0; i < 1000; i++){
            if(sortedLeft[i] > sortedRight[i]){
                sum += sortedLeft[i] - sortedRight[i];
            }
            if(sortedLeft[i] < sortedRight[i]){
                sum += sortedRight[i] - sortedLeft[i];
            }
        }
        return sum;
        
    }


    // TODO: Complete Part Two!
    public static int partTwo(int[] lines) {
        int similarity = 0;
        
        int[] sortedLeft = {10006, 10164, 10186, 10190, 10209, 10313, 10418, 10526, 10571, 10766, 10825, 10838, 10892, 10980, 11062, 11273, 11278, 11411, 11519, 11522, 11814, 11876, 11879, 11883, 11887, 11907, 11950, 11959, 12018, 12241, 12300, 12479, 12762, 12807, 12873, 12936, 12937, 13200, 13223, 13233, 13293, 13403, 13510, 13550, 13554, 13592, 13646, 13811, 13820, 13841, 13960, 14025, 14077, 14111, 14123, 14207, 14585, 14655, 14803, 14979, 15215, 15233, 15248, 15369, 15585, 15737, 15788, 15982, 16125, 16210, 16242, 16375, 16487, 16557, 16839, 16857, 16970, 17009, 17066, 17092, 17187, 17713, 17744, 17757, 18053, 18076, 18158, 18185, 18231, 18301, 18371, 18390, 18518, 18609, 18670, 18732, 18912, 18983, 19040, 19101, 19107, 19189, 19335, 19404, 19512, 19586, 19797, 19816, 19900, 20043, 20096, 20171, 20247, 20341, 20352, 20426, 20473, 20616, 20645, 20661, 20858, 20971, 21002, 21224, 21522, 21526, 21597, 21745, 21762, 21766, 21860, 21873, 21923, 22296, 22532, 22543, 22587, 22832, 22936, 23027, 23069, 23142, 23150, 23174, 23262, 23400, 23402, 23437, 23458, 23460, 23497, 23507, 23577, 23620, 23734, 23863, 23871, 23898, 23921, 24111, 24255, 24436, 24444, 24726, 24815, 24909, 24928, 24957, 24972, 25031, 25055, 25101, 25136, 25217, 25311, 25536, 25598, 25734, 25749, 25750, 25775, 25788, 25871, 25994, 25998, 26043, 26105, 26139, 26154, 26162, 26163, 26186, 26244, 26251, 26355, 26562, 26794, 26912, 27276, 27531, 27722, 27789, 27889, 27982, 28063, 28083, 28110, 28114, 28174, 28394, 28435, 28564, 28659, 28786, 28837, 28905, 28988, 29046, 29326, 29419, 29431, 29605, 29688, 29852, 29914, 29917, 29939, 30246, 30332, 30406, 30472, 30619, 30688, 30760, 30874, 30924, 30945, 30980, 31068, 31093, 31210, 31341, 31388, 31695, 31806, 31815, 31830, 31839, 31853, 32018, 32058, 32061, 32091, 32127, 32215, 32235, 32514, 32604, 32705, 32725, 32915, 32971, 33067, 33113, 33138, 33174, 33383, 33523, 33542, 33575, 33767, 33771, 33803, 33936, 34081, 34098, 34169, 34224, 34410, 34461, 34464, 34597, 34633, 34659, 34710, 34830, 34839, 34896, 34909, 34931, 34995, 35004, 35115, 35136, 35159, 35166, 35222, 35298, 35348, 35359, 35406, 35479, 35570, 35576, 35680, 35898, 35929, 36023, 36067, 36136, 36385, 36447, 36612, 36665, 36872, 36927, 37000, 37065, 37079, 37180, 37228, 37264, 37309, 37359, 37402, 37494, 37503, 37673, 37699, 37749, 37882, 37912, 37979, 38007, 38143, 38199, 38451, 38548, 38669, 38775, 38801, 38922, 38951, 38976, 39036, 39113, 39163, 39289, 39333, 39335, 39390, 39544, 39556, 39618, 39634, 39749, 39844, 39874, 39926, 39998, 40047, 40065, 40109, 40121, 40255, 40280, 40505, 40798, 40843, 40997, 41048, 41068, 41130, 41137, 41146, 41196, 41305, 41396, 41593, 41598, 41611, 41620, 41636, 41645, 41883, 41958, 42012, 42092, 42170, 42325, 42579, 42783, 42786, 42958, 43236, 43387, 43545, 43577, 43606, 43743, 43886, 43911, 43947, 44034, 44335, 44458, 44522, 44562, 44594, 44642, 44764, 44817, 44922, 45148, 45199, 45203, 45270, 45298, 45484, 45646, 45806, 45835, 45853, 45913, 45943, 46102, 46354, 46401, 46490, 46514, 46780, 46869, 47137, 47312, 47400, 47465, 47516, 47639, 47704, 47748, 47751, 47771, 47900, 47978, 48009, 48125, 48171, 48317, 48331, 48401, 48651, 48702, 48768, 48804, 49126, 49194, 49366, 49438, 49611, 49612, 49639, 49784, 49831, 49885, 49947, 50050, 50113, 50169, 50403, 50561, 50601, 50603, 50640, 50646, 50651, 50882, 51189, 51534, 51579, 51617, 51623, 51669, 51754, 51805, 51869, 51903, 52036, 52339, 52340, 52422, 52443, 52504, 52619, 52642, 52733, 52763, 52812, 52958, 53092, 53133, 53134, 53147, 53148, 53190, 53415, 53459, 53651, 53861, 53944, 54008, 54066, 54119, 54179, 54418, 54422, 54482, 54561, 54669, 54675, 54711, 54847, 54935, 55015, 55216, 55269, 55365, 55374, 55465, 55740, 55841, 55868, 56088, 56231, 56304, 56360, 56369, 56440, 56567, 56644, 56645, 56743, 56779, 57155, 57295, 57354, 57385, 57423, 57426, 57483, 57542, 57650, 57724, 57886, 58119, 58293, 58295, 58377, 58496, 58577, 58613, 58692, 58698, 58705, 58773, 58775, 58835, 58950, 58996, 59032, 59165, 59257, 59569, 59643, 60682, 60775, 60832, 60960, 61188, 61241, 61256, 61275, 61317, 61384, 61519, 61562, 61611, 61630, 61747, 61882, 61899, 61936, 61949, 61975, 62108, 62155, 62212, 62222, 62285, 62303, 62306, 62376, 62415, 62441, 62487, 62645, 62722, 62744, 62886, 63046, 63172, 63247, 63352, 63422, 63911, 63914, 63979, 64135, 64266, 64278, 64333, 64442, 64470, 64581, 64743, 64921, 65101, 65300, 65491, 65729, 65746, 65936, 65978, 66080, 66106, 66314, 66336, 66344, 66544, 66822, 67045, 67110, 67152, 67201, 67251, 67395, 67459, 67472, 67527, 67646, 68166, 68167, 68244, 68311, 68371, 68467, 68659, 68715, 68726, 69012, 69148, 69340, 69477, 69645, 69764, 70044, 70063, 70163, 70197, 70201, 70253, 70325, 70393, 70625, 70745, 70752, 70817, 70854, 70892, 70907, 70943, 70988, 71026, 71318, 71325, 71330, 71427, 71651, 71721, 71851, 71888, 71958, 71962, 71980, 72110, 72153, 72185, 72241, 72473, 72503, 72660, 72690, 72744, 72802, 73040, 73067, 73351, 73759, 73885, 74157, 74251, 74290, 74340, 74624, 74662, 74862, 74955, 74971, 75164, 75200, 75267, 75290, 75305, 75565, 75606, 75620, 75926, 75978, 76238, 76273, 76362, 76399, 76536, 76573, 76587, 76703, 77123, 77157, 77222, 77241, 77417, 77477, 77502, 77593, 77678, 77771, 77848, 77929, 78168, 78216, 78393, 78705, 78901, 78924, 79021, 79089, 79108, 79184, 79411, 79413, 79546, 79565, 79572, 79657, 79794, 79833, 79910, 79961, 80049, 80130, 80176, 80334, 80436, 80448, 80471, 80596, 80705, 80869, 81081, 81197, 81387, 81489, 81556, 81598, 81693, 81838, 81878, 81957, 81975, 81984, 82010, 82021, 82187, 82269, 82324, 82440, 82498, 82553, 82672, 82677, 82711, 82841, 82922, 83001, 83096, 83210, 83312, 83437, 83666, 83669, 83701, 83754, 83822, 83974, 84094, 84099, 84281, 84349, 84391, 84499, 84518, 84626, 84634, 84704, 84769, 84826, 85116, 85125, 85143, 85251, 85362, 85368, 85411, 85522, 85585, 85590, 85735, 85808, 85923, 85961, 86000, 86060, 86152, 86221, 86307, 86367, 86437, 86439, 86650, 86815, 86836, 86928, 87004, 87067, 87100, 87334, 87344, 87552, 87598, 87645, 87822, 87856, 87909, 87924, 88067, 88161, 88173, 88272, 88382, 88390, 88399, 88420, 88743, 88888, 88960, 89050, 89131, 89204, 89248, 89279, 89370, 89406, 89612, 89734, 89800, 90008, 90291, 90383, 90388, 90404, 90435, 90697, 90698, 90755, 90860, 90977, 90995, 91064, 91199, 91232, 91248, 91540, 91557, 91611, 91631, 91663, 91704, 91844, 91871, 92381, 92522, 92648, 92678, 92979, 93111, 93218, 93370, 93419, 93477, 93528, 93662, 93745, 93775, 93790, 93874, 94136, 94234, 94441, 94592, 94698, 94750, 94829, 94912, 95079, 95123, 95143, 95350, 95361, 95481, 95590, 95606, 95632, 95805, 95867, 95898, 95965, 95976, 96019, 96021, 96127, 96152, 96159, 96196, 96277, 96305, 96308, 96412, 96545, 96622, 96781, 96930, 97072, 97132, 97334, 97382, 97439, 97511, 97617, 97638, 97642, 97780, 97799, 97836, 97885, 98077, 98095, 98114, 98177, 98181, 98238, 98257, 98388, 98506, 98705, 98781, 98791, 98874, 98955, 98975, 99101, 99197, 99274, 99381, 99427, 99451, 99452, 99510, 99696, 99872, 99894, 99941};
       int[] sortedRight = {10020, 10118, 10294, 10360, 10376, 10380, 10418, 10418, 10418, 10418, 10418, 10418, 10418, 10418, 10418, 10418, 10418, 10418, 10707, 10972, 11177, 11239, 11382, 11473, 11566, 11626, 11799, 12031, 12036, 12246, 12302, 12440, 12692, 12762, 12762, 12762, 12762, 12762, 12762, 12762, 12847, 12892, 13269, 13386, 13421, 13483, 13514, 13569, 13849, 14008, 14030, 14131, 14141, 14573, 15026, 15170, 15403, 15704, 15747, 16006, 16165, 16352, 16487, 16487, 16487, 16487, 16487, 16487, 16487, 16487, 16487, 16557, 16557, 16557, 16557, 16557, 16557, 16557, 16557, 16557, 16557, 16557, 16557, 16557, 16557, 16557, 16557, 16557, 16557, 16688, 16735, 17170, 17235, 17490, 17664, 17765, 17822, 17823, 17968, 17977, 18104, 18265, 18396, 19340, 19518, 19783, 19816, 19816, 19816, 19816, 19816, 19900, 19900, 19900, 19900, 20123, 20364, 20372, 20638, 20670, 20839, 20886, 21065, 21106, 21152, 21202, 21216, 21470, 21612, 21873, 21873, 21873, 21873, 21873, 21873, 21873, 21873, 21873, 21873, 21873, 21873, 21873, 21873, 21873, 21873, 21873, 21873, 21873, 21942, 21970, 21993, 22002, 22219, 22401, 22415, 22536, 22620, 23126, 23188, 23460, 23460, 23460, 23460, 23460, 23460, 23460, 23460, 23460, 23460, 23460, 23460, 23460, 23477, 23569, 23751, 23827, 23835, 24056, 24110, 24323, 24607, 24788, 24957, 24957, 24957, 24957, 24957, 24957, 24957, 24957, 24957, 24957, 24957, 24957, 24957, 24957, 25342, 25421, 25454, 25522, 25710, 25736, 25803, 25976, 25994, 25994, 25994, 26162, 26162, 26162, 26162, 26162, 26162, 26162, 26162, 26162, 26186, 26525, 26540, 26603, 26647, 26701, 26808, 27189, 27309, 27331, 27338, 27531, 27531, 27531, 27531, 27531, 27531, 27531, 27531, 27531, 27531, 27531, 27636, 27795, 27808, 27854, 28021, 28044, 28168, 28694, 29070, 29230, 29289, 29344, 29383, 29495, 29744, 29813, 29820, 29967, 30266, 30462, 30651, 30929, 31093, 31093, 31093, 31093, 31093, 31093, 31093, 31093, 31093, 31093, 31093, 31093, 31093, 31093, 31093, 31093, 31148, 31362, 31388, 31388, 31388, 31512, 31575, 31668, 31683, 31691, 31786, 31847, 31857, 31859, 31861, 31888, 32627, 32705, 32705, 32705, 32705, 32705, 32705, 32705, 32705, 32705, 32705, 32718, 32745, 32778, 32812, 32914, 32953, 33219, 33239, 33777, 34459, 34663, 34874, 35302, 35587, 35609, 35634, 35704, 35914, 36746, 36867, 37143, 37223, 37250, 37656, 37749, 37749, 37749, 37749, 37749, 37749, 37749, 37749, 37749, 37749, 37749, 37749, 37749, 37882, 37882, 38134, 38328, 38370, 38677, 38721, 38813, 38866, 39006, 39025, 39040, 39047, 40064, 40138, 40240, 40417, 40435, 40549, 40607, 40798, 40798, 40798, 40798, 40798, 40798, 40798, 40798, 40798, 40798, 40798, 40798, 40798, 40798, 40798, 40798, 40798, 40798, 40798, 40798, 40976, 41135, 41525, 41567, 41574, 41647, 42027, 42246, 42478, 42768, 42776, 42821, 42840, 42844, 42919, 43026, 43055, 43167, 43422, 43430, 43597, 43896, 43959, 43961, 44012, 44054, 44095, 44272, 44341, 44351, 44438, 44521, 44711, 45336, 45398, 45479, 45543, 45581, 45819, 45856, 45889, 46077, 46304, 46378, 46860, 47022, 47173, 47276, 47345, 47384, 47386, 47499, 48396, 48623, 48671, 48934, 48939, 49126, 49126, 49126, 49126, 49126, 49126, 49126, 49126, 49126, 49126, 49126, 49126, 49126, 49126, 49126, 49148, 49170, 49358, 49374, 49517, 49701, 50029, 50089, 50324, 50389, 50448, 50494, 50508, 50551, 50601, 50601, 50601, 50601, 50601, 50601, 50601, 50601, 50601, 50800, 50899, 51245, 51482, 51524, 51880, 52047, 52063, 52236, 52357, 52468, 52525, 52645, 52851, 53178, 53284, 53390, 53461, 53944, 53944, 53944, 53944, 53944, 53944, 53944, 53944, 53944, 53944, 53944, 53944, 53944, 53944, 53944, 53944, 53944, 53944, 54121, 54192, 54268, 54482, 54482, 54482, 54482, 54482, 54482, 54482, 54482, 54482, 54482, 54482, 54482, 54482, 54482, 54482, 54482, 54482, 54494, 54548, 54621, 54696, 54898, 55135, 55692, 55762, 55825, 56014, 56129, 56398, 56786, 56805, 56880, 57030, 57072, 57740, 57813, 57981, 58099, 58274, 58285, 58801, 58965, 59092, 59184, 59338, 59362, 59420, 59687, 60171, 60179, 60647, 60818, 60858, 61032, 61228, 61349, 61472, 61535, 61884, 61925, 61981, 62194, 62400, 62411, 62613, 62892, 63048, 63081, 63275, 63310, 63332, 63538, 63703, 63745, 63765, 64049, 64145, 64197, 64490, 64498, 64544, 64579, 64667, 64743, 64743, 64743, 64743, 64743, 64743, 64743, 64743, 64743, 64743, 64743, 64743, 64743, 64971, 65035, 65101, 65101, 65101, 65101, 65101, 65101, 65101, 65101, 65101, 65101, 65101, 65348, 65384, 65391, 65543, 65807, 66005, 66094, 66300, 66423, 66439, 66504, 66710, 66749, 66779, 66889, 67008, 67106, 67136, 67308, 67494, 67545, 67603, 67636, 67658, 67725, 67792, 67919, 67963, 68082, 68154, 68195, 68392, 68603, 68652, 68948, 68984, 69037, 69420, 69512, 69547, 69572, 69671, 70467, 70473, 70751, 70926, 70928, 71276, 71450, 71454, 71530, 71765, 71858, 72508, 72612, 72898, 72900, 73375, 73486, 74195, 74202, 74413, 74437, 74883, 74893, 74997, 75318, 75353, 75439, 75483, 75491, 75583, 75651, 75667, 75702, 75970, 76035, 76125, 76577, 76582, 76645, 76721, 76986, 77104, 77124, 77193, 77417, 77417, 77417, 77417, 77417, 77417, 77417, 77417, 77417, 77417, 77417, 77417, 77420, 77449, 77493, 77593, 77593, 77593, 77593, 77593, 77593, 77593, 77593, 77681, 77759, 77870, 77897, 77972, 78231, 78317, 78321, 78381, 78393, 78393, 78393, 78393, 78393, 78393, 78513, 78684, 78725, 78921, 79005, 79338, 79445, 79528, 79820, 79885, 80128, 80234, 80320, 80342, 80348, 80409, 80428, 80662, 80725, 80828, 81007, 81047, 81173, 81197, 81197, 81197, 81197, 81197, 81197, 81197, 81197, 81197, 81197, 81395, 81591, 81598, 81598, 81598, 81598, 81598, 81598, 81598, 81598, 81598, 81598, 81598, 81598, 81598, 81598, 81598, 81598, 81598, 81598, 81638, 81990, 82443, 82468, 82700, 82734, 82816, 83066, 83096, 83096, 83096, 83096, 83096, 83096, 83096, 83096, 83096, 83096, 83096, 83096, 83096, 83096, 83096, 83096, 83096, 83184, 83283, 83526, 83532, 83818, 83821, 84087, 84284, 84294, 84361, 84414, 84492, 84499, 84499, 84502, 84513, 84879, 85007, 85051, 85056, 85292, 85675, 85750, 85802, 85839, 85940, 85993, 86123, 86168, 86221, 86221, 86221, 86756, 86836, 87351, 87368, 87493, 87767, 88157, 88283, 88406, 88447, 88608, 88915, 89001, 89007, 89035, 89095, 89135, 89320, 89404, 89511, 89592, 89612, 89612, 89612, 89612, 89612, 89612, 89612, 89612, 89612, 89612, 89612, 89612, 89612, 89612, 89612, 89612, 89612, 89612, 89612, 89612, 90035, 90413, 90430, 90579, 90621, 90719, 90769, 90907, 91094, 91261, 91319, 91366, 91670, 91706, 91790, 91806, 91866, 92064, 92178, 92284, 92381, 92381, 92381, 92381, 92381, 92381, 92381, 92381, 92381, 92381, 92381, 92381, 92381, 92381, 92381, 92381, 92381, 92381, 92381, 92381, 92787, 93023, 93066, 93247, 93419, 93419, 93419, 93419, 93419, 93419, 93759, 93949, 93951, 93953, 94258, 94417, 94495, 94748, 95015, 95081, 95296, 95318, 95517, 95669, 95778, 95877, 96327, 96615, 96622, 96622, 96622, 96622, 96622, 96622, 96622, 96712, 96803, 97049, 97524, 97629, 97669, 97762, 98552, 98667, 98689, 98705, 98705, 98705, 98705, 98705, 98705, 98705, 98705, 98705, 98705, 98705, 99027, 99063, 99427, 99596, 99638, 99914};
        
       for(int i = 0; i < 1000; i++){
            for(int j = 0; j < 1000; j++){
                if(sortedLeft[i] == sortedRight[j]){
                    similarity+= sortedLeft[i];
                }
            }
        }
        return similarity;
    }




// -------------------------------------------------------------------------------------- //
    // HELPER METHODS


    /*
     * A method to read Strings from a file into an array that is then returned.
     * Pass in the path to the file you want to read.
     */
    public static String[] readStringsFromFile(String fileName) {
        try {
            File myObj = new File(fileName);
            Scanner myReader = new Scanner(myObj);
            int lineCount = 0;


            while (myReader.hasNextLine()) {
                myReader.nextLine();
                lineCount++;
            }
            myReader.close();


            String[] lines = new String[lineCount];
            Scanner myReader2 = new Scanner(myObj);
            int index = 0;
            while (myReader2.hasNextLine()) {
                String data = myReader2.nextLine();
                lines[index] = data;
                index++;
            }
            myReader2.close();
            return lines;
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            String[] dummy = new String[1];
            return dummy;
        }
    }
   
    /*
     * A method to read ints from a file into an array that is then returned.
     * Pass in the path to the file you want to read.
     */
    public static int[] readIntsFromFile(String fileName) {
        try {
            File myObj = new File(fileName);
            Scanner myReader = new Scanner(myObj);
            int lineCount = 0;


            while (myReader.hasNextLine()) {
                myReader.nextLine();
                lineCount++;
            }
            myReader.close();


            int[] lines = new int[lineCount];
            Scanner myReader2 = new Scanner(myObj);
            int index = 0;
            while (myReader2.hasNextLine()) {
                int data = Integer.parseInt(myReader2.nextLine());
                lines[index] = data;
                index++;
            }
            myReader2.close();
            return lines;
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            int[] dummy = new int[1];
            return dummy;
        }
           
    }
   
    /*
     * A method to read longs from a file into an array that is then returned.
     * Pass in the path to the file you want to read.
     */
    public static long[] readLongsFromFile(String fileName) {
        try {
            File myObj = new File(fileName);
            Scanner myReader = new Scanner(myObj);
            int lineCount = 0;


            while (myReader.hasNextLine()) {
                myReader.nextLine();
                lineCount++;
            }
            myReader.close();


            long[] lines = new long[lineCount];
            Scanner myReader2 = new Scanner(myObj);
            int index = 0;
            while (myReader2.hasNextLine()) {
                long data = Long.parseLong(myReader2.nextLine());
                lines[index] = data;
                index++;
            }
            myReader2.close();
            return lines;
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            long[] dummy = new long[1];
            return dummy;
        }
    }
   
       
}



