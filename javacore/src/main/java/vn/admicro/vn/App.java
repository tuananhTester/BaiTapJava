package vn.admicro.vn;
import static org.junit.Assert.assertTrue;


import org.junit.Assert;
import org.junit.Test;

import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public String checkSo(int number){
        String numberString = "";

        if(number == 0){
            numberString = "Không";
        }
        else if(number == 1){
            numberString = "Một";
        }
        else if(number == 2){
            numberString = "Hai";
        }
        else if(number == 3){
            numberString = "Ba";
        }
        else if(number == 4){
            numberString = "Bốn";
        }
        else if(number == 5){
            numberString = "Năm";
        }
        else if(number == 6){
            numberString = "Sáu";
        }
        else if(number == 7){
            numberString = "Bảy";
        }
        else if(number == 8){
            numberString = "Tám";
        }
        else if(number == 9){
            numberString = "Chín";
        }
        else {
            numberString = "Không biết";
        }

        return numberString;
    }

    @Test
    public void Test_DocSo_Positive() {
        int number =8;
        String expected = "Tám";
        String actual = this.checkSo(number);

        Assert.assertEquals(expected, actual);


    }

    //Bài 1 ------------------------
    public int TinhTongSoChan(int n){
        int num = 0;
        for(int i = 2; i < n; i+=2)
        {
            num += i;
        }

        return num;
    }

    @Test
    public void Test_TinhTongSoChan_Positive() {
        int number = 10;
        int expected = 20;
        int actual = this.TinhTongSoChan(number);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void Test_TinhTongSoChan_Negative() {
        int number = 8;
        int expected = 20;
        int actual = this.TinhTongSoChan(number);
        Assert.assertEquals(expected, actual);
    }

    //Bài 2 ------------------------

    //Bài 3: ------------------------
    //số nguyên tô là số lớn hơn 1 và chỉ chia hêt cho 1 và chính nó
    public boolean isSoNguyenTo(int n){
        //n < 2 không phải số nguyên tố
        if(n < 2){
            return false;
        }

        //int num = (int) Math.sqrt(n); // lấy căn bậc 2 để làm ngắn gọn số lần lặp

        for (int i = 2; i < n; i++) {
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }

    @Test
    public void Test_CheckSoNguyenTo_Positive() {
        int number = 3;
        boolean expected = true;
        boolean actual = this.isSoNguyenTo(number);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void Test_CheckSoNguyenTo_Negative() {
        int number = 4;
        boolean expected = false;
        boolean actual = this.isSoNguyenTo(number);
        Assert.assertEquals(expected, actual);
    }

    //Bài 4 ------------------------

    public int USCLN(int a, int b){
        if (b == 0) return a;
        return USCLN(b, a%b);
    }

    @Test
    public void Test_USCLN_Positive() {
        int number_1 = 15;
        int number_2 = 40;

        int expected = 5;
        int actual = this.USCLN(number_1, number_2);
        System.out.println(actual);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void Test_USCLN_Negative() {
        int number_1 = 15;
        int number_2 = 40;

        int expected = 5;
        int actual = this.USCLN(number_1, number_2);
        System.out.println(actual);
        Assert.assertEquals(expected, actual);
    }

    //Bài 5 ------------------------


    public String TimCapSo(int[] arr, int sum){
        String text = "";
        for (int i = 0; i < arr.length - 1; i++)
        {
            for (int j = i + 1; j < arr.length; j++)
            {
                if (arr[i] + arr[j] == sum)
                {
                    System.out.println("Cap so nguyen can tim nam tai vi tri {0} va {1} ({2} + {3}),"+ i + ","+ j + "," + arr[i]+ "," + arr[j]);
                    text = "Có tìm thấy cặp số";
                    return text;
                }
            }
        }

        text = "Không tiìm thấy cặp nào";
        return text;
    }

    @Test
    public void Test_TimCapSo_Positive() {
        int[] arr = {8, 7, 2, 5, 3, 1};
        int sum = 10;
        String expected = "Có tìm thấy cặp số";
        String actual = this.TimCapSo(arr, sum);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void Test_TimCapSo_Negative() {
        int[] arr = {0, 6, 2, 5, 3, 1};
        int sum = 10;
        String expected = "Không tiìm thấy cặp nào";
        String actual = this.TimCapSo(arr, sum);
        Assert.assertEquals(expected, actual);
    }

    //Bài 6 ------------------------

    public boolean isSoNguyenTo2(int n){
        //n < 2 không phải số nguyên tố
        if(n < 2){
            return false;
        }

        //int num = (int) Math.sqrt(n); // lấy căn bậc 2 để làm ngắn gọn số lần lặp

        for (int i = 2; i < n; i++) {
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }

    @Test
    public void Test_CheckSoNguyenTo2_Positive() {
        int number = 100;
        for (int i = 3; i < number; i+=2) {
            if (isSoNguyenTo2(i)) {
                System.out.print(" " + i);
            }
        }
    }

    @Test
    public void Test_CheckSoNguyenTo2_Negative() {

    }

    //Bài 7 ------------------------

    public boolean isSoNguyenTo3(int n){
        //n < 2 không phải số nguyên tố
        if(n < 2){
            return false;
        }

        //int num = (int) Math.sqrt(n); // lấy căn bậc 2 để làm ngắn gọn số lần lặp

        for (int i = 2; i < n; i++) {
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }

    @Test
    public void Test_CheckSoNguyenTo3_Positive() {
        //Nhập n = 10
        //10 số nguyên tố đầu tiên là:
        //2 3 5 7 11 13 17 19 23 29

        int number = 10;
        int dem = 0; // đếm số số nguyên tố
        int i = 2;   // tìm số nguyên tố bắt dầu từ số 2
        while (dem < number) {
            if (isSoNguyenTo3(i)) {
                System.out.print(i + " ");
                dem++;
            }
            i++;
        }
    }

    @Test
    public void Test_CheckSoNguyenTo3_Negative() {

    }

    //Bài 8 ------------------------

    public boolean isSoNguyenTo4(int n){
        //n < 2 không phải số nguyên tố
        if(n < 2){
            return false;
        }

        //int num = (int) Math.sqrt(n); // lấy căn bậc 2 để làm ngắn gọn số lần lặp

        for (int i = 2; i < n; i++) {
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }

    public void phanTich(int n){
        int i=2;
        while(n>1){
            if(this.isSoNguyenTo4(i)){
                if(n%i==0){
                    System.out.print(i+".");
                    n/=i;
                }
                else
                    i++;
            }
            else
                i++;
        }
    }

    @Test
    public void Test_CheckSoNguyenTo4_Positive() {
        //Nhập n = 10
        //10 số nguyên tố đầu tiên là:
        //2 3 5 7 11 13 17 19 23 29

        this.phanTich(200);
    }

    @Test
    public void Test_CheckSoNguyenTo4_Negative() {

    }


    //Bài 9 ------------------------
    //Quy luật của dãy số Fibonacci: số tiếp theo bằng tổng của 2 số trước, 2 số đầu tiên của dãy số là 0, 1. Ví dụ: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, …
    public static int fibonacci(int k) {
        int f0 = 0, f1 = 1, fn = 1;
        if(k<0) {
            return -1;
        }else if((k==0)||(k==1)) {
            return k;
        }else {
            for(int i=2; i<k; i++) {
                f0 = f1;
                f1 = fn;
                fn = f0 + f1;
            }
        }
        return fn;
    }
    @Test
    public void Test_Fibonacci_Positive() {
        int number = 9;
        int expected = 34;
        int actual = this.fibonacci(number);
        System.out.println(actual);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void Test_Fibonacci_Negative() {

    }

    //Bài 10 ------------------------

    public static void InSoChan(int [] arr){
        List<Integer> arrPrint = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] %2 == 0){
                arrPrint.add(arr[i]);
            }

        }
        System.out.println(arrPrint);
    }
    @Test
    public void Test_InSoChan_Positive() {
        int[] arr = {0,1,2,4,5,6,8,9,10};
        InSoChan(arr);

    }

    //Bài 11 ------------------------

    //Bài 12 ------------------------

    public static void DaoNguocMang(int [] arr){
        for (int i = 0, j = arr.length - 1; i < j; i++, j--){
            /*Tạo biến temp và tiến hành hoán đổi phần tử*/
            int temp = arr[i];
            arr[i]  = arr[j];
            arr[j] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void Test_DaoNguocMang_Positive() {
        int[] arr = {0,1,2,4,5,6,8,9,10};
        DaoNguocMang(arr);
    }

    //Bài 13 ------------------------

    public static void checkSoNhoHon(int [] arr, int num){
        List<Integer> arrPrint = new ArrayList<>();

        //int [] arrPrint = {};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < num){
                arrPrint.add(arr[i]);
                //System.out.println(arr[i]);
            }
        }

        System.out.println(arrPrint);

    }

    @Test
    public void Test_checkSoNhoHon_Positive() {
        int[] arr = {0,1,2,4,5,6,8,9,10};
        checkSoNhoHon(arr,6);
    }

    //Bài 14 ------------------------
    public static void TinhTong2Mang(int [] arr1, int [] arr2){
        int sum = 0;
        List<Integer> arrPrint = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
                sum = arr1[i] + arr2[i];
                arrPrint.add(sum);
        }

        System.out.println(arrPrint);
    }

    @Test
    public void Test_TinhTong2Mang_Positive() {
        int[] arr1 = {0,1,2,4,5};
        int[] arr2 = {6,7,8,9,10};
        TinhTong2Mang(arr1,arr2);
    }

    //Bài 15 ------------------------
    public static void TimPhanTuGiong(int [] arr1, int [] arr2, int m, int n){
        int i = 0, j = 0;

        while (i < m && j < n) {
            if (i > 0 && arr1[i] == arr1[i - 1]) {// For Handling duplicates
                i++;
                continue;
            }
            if (arr1[i] < arr2[j])
                i++;
            else if (arr2[j] < arr1[i])
                j++;
            else {
                System.out.print(arr2[j++] + " ");
                i++;
            }
        }
    }

    @Test
    public void Test_TimPhanTuGiong_Positive() {
        int arr1[] = { 1, 2, 2, 3, 4 };
        int arr2[] = { 2, 2, 4, 6, 7, 8 };
        int m = arr1.length;
        int n = arr2.length;
        TimPhanTuGiong(arr1, arr2, m, n);

    }
}
