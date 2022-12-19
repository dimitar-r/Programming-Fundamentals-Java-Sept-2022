package pbExam;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ThePianist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countPieces = Integer.parseInt(scanner.nextLine());
        Map<String, List<String>> piecesMap = new LinkedHashMap<>();
        for (int piece = 1; piece <= countPieces; piece++) {
            String pieceData = scanner.nextLine();
            String[] pieceParts = pieceData.split("\\|");
        }
    }
}
