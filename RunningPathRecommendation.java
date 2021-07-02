
/**
 * Main object for running path recommendation
 *
 * @author Anggito
 * @version ver 1.0 - 2 July 21
 */

import java.util.Scanner;
import java.util.Vector;
 
class RunnungPathRecommendation {
    static int MAX_INT = Integer.MAX_VALUE;

    public static int bestPath(int crossroadAmount, int tempCrossroad, int dest, boolean visited[], int graph[][]) {
        // Best Path found / Base Case
        // further distance will be 0
        if(tempCrossroad == dest) {
            return 0;
        }

        // Mark current crossroad as visited
        visited[tempCrossroad] = true;

        // next neighbor distance will be max for temporary
        int ans = MAX_INT;

        // traverse all adjacent crossroad
        for(int i = 0; i<crossroadAmount; i++) {
            if(graph[tempCrossroad][i] != MAX_INT && !visited[i]) {
                // Add real adjacent crossroad's distance
                int curr = bestPath(crossroadAmount, i, dest, visited, graph);

                // if dest reached
                if(curr < MAX_INT) {
                    // find minimum distance
                    ans = Math.min(ans, graph[tempCrossroad][i] + curr);
                }
            }
        }

        // Unmark current node so can be used again
        visited[tempCrossroad] = false;

        // Return best distance
        return ans;
    }

    public static void main(String[] args) {
        // Initialize crossroad's amount
        int amount = 12;

        // array of crossroads
        Vector<crossRoadNode> crossroadList = new Vector<crossRoadNode>();

        // Initialize crossroads
        crossRoadNode cross0 = new crossRoadNode(0, "Teknik Kimia");
        crossRoadNode cross1 = new crossRoadNode(1, "Teknik Hidrodinamika");
        crossRoadNode cross2 = new crossRoadNode(2, "Taman Teknologi");
        crossRoadNode cross3 = new crossRoadNode(3, "Teknik Perkapalan");
        crossRoadNode cross4 = new crossRoadNode(4, "Teknik Mesin 2");
        crossRoadNode cross5 = new crossRoadNode(5, "Perpustakaan ITS");
        crossRoadNode cross6 = new crossRoadNode(6, "Taman Dr. Angka");
        crossRoadNode cross7 = new crossRoadNode(7, "Teknik Mesin 1");
        crossRoadNode cross8 = new crossRoadNode(8, "Taman Alumni");
        crossRoadNode cross9 = new crossRoadNode(9, "Bundaran ITS 1");
        crossRoadNode cross10 = new crossRoadNode(10, "Bundaran ITS 2");
        crossRoadNode cross11 = new crossRoadNode(11, "Bundaran ITS 3");
        
        crossroadList.add(cross0);
        crossroadList.add(cross1);
        crossroadList.add(cross2);
        crossroadList.add(cross3);
        crossroadList.add(cross4);
        crossroadList.add(cross5);
        crossroadList.add(cross6);
        crossroadList.add(cross7);
        crossroadList.add(cross8);
        crossroadList.add(cross9);
        crossroadList.add(cross10);
        crossroadList.add(cross11);

        // Initializing maps
        int graph[][] = new int[amount][amount];

        for(int i = 0; i < amount; i++) {
            for(int j = 0; j < amount; j++) {
                graph[i][j] = Integer.MAX_VALUE;
            }
        }

        // Mark all crossroad unvisited
        boolean visited[] = new boolean[amount];
        for(int i = 0; i<amount; i++) {
            visited[i] = false;
        }

        // Initializing all roads
        graph[0][1] = 12;
        graph[0][2] = 40;
        graph[0][3] = 15;
        graph[1][2] = 32;
        graph[2][0] = 40;
        graph[2][7] = 45;
        graph[3][4] = 20;
        graph[4][8] = 22;
        graph[5][6] = 20;
        graph[6][5] = 20;
        graph[6][7] = 18;
        graph[7][2] = 45;
        graph[7][6] = 18;
        graph[7][8] = 20;
        graph[8][7] = 20;
        graph[8][11] = 11;
        graph[9][11] = 8;
        graph[10][9] = 8;
        graph[10][11] = 8;
        graph[11][10] = 8;
        graph[11][6] = 24;

        // Main user interface
        new AppFrame();

        /*Scanner inpObj = new Scanner(System.in);

        System.out.println("Pilih tempat sekarang :");
        System.out.println("1. Teknik Kimia");
        System.out.println("2. Teknik Hidrodinamika");
        System.out.println("3. Taman Teknologi");
        System.out.println("4. Teknik Perkapalan");
        System.out.println("5. Teknik Mesin 2");
        System.out.println("6. Perpustakaan ITS");
        System.out.println("7. Taman Dr. Angka");
        System.out.println("8. Teknik Mesin 1");
        System.out.println("9. Taman Alumni");
        System.out.println("10. Bundaran ITS 1");
        System.out.println("11. Bundaran ITS 2");
        System.out.println("12. Bundaran ITS 3");

        int src = inpObj.nextInt();

        System.out.println("Pilih tempat tujuan :");        
        System.out.println("1. Teknik Kimia");
        System.out.println("2. Teknik Hidrodinamika");
        System.out.println("3. Taman Teknologi");
        System.out.println("4. Teknik Perkapalan");
        System.out.println("5. Teknik Mesin 2");
        System.out.println("6. Perpustakaan ITS");
        System.out.println("7. Taman Dr. Angka");
        System.out.println("8. Teknik Mesin 1");
        System.out.println("9. Taman Alumni");
        System.out.println("10. Bundaran ITS 1");
        System.out.println("11. Bundaran ITS 2");
        System.out.println("12. Bundaran ITS 3");

        int dest = inpObj.nextInt();

        if(src == dest) {
            System.out.println("Tempat sekarang dan tujuan anda sama, Mohon coba lagi");
        }
        else {
            int dist = bestPath(amount, src-1, dest-1, visited, graph);
            System.out.println("Tempat mulai berlari Anda : " + crossroadList.elementAt(src-1).getLabel());
            System.out.println("Tujuan berlari Anda : " + crossroadList.elementAt(dest-1).getLabel());
            System.out.println("Jarak terbaik Anda : " + dist);
            System.out.println("Selamat Berlari !");
        }
        inpObj.close();*/
    }
}