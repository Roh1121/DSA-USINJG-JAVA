class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n,m;
        n = matrix.length;
        m = matrix[0].length;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int top=0,bottom=n-1,left=0,right=m-1,i;
        while(top<=bottom && left<=right)
    {
        for(i=left;i<=right;i++)
        {
            arr.add(matrix[top][i]);
        }
        top++;
        for(i=top;i<=bottom;i++)
        {
            arr.add(matrix[i][right]);
        }
        right--;
        if(top<=bottom)
        {
        for(i=right;i>=left;i--)
        {
            arr.add(matrix[bottom][i]);
        }
        bottom--;
        }
        if(left<=right)
        {
        for(i=bottom;i>=top;i--)
        {
            arr.add(matrix[i][left]);
        }
        left++;
        }
    }
    return arr;
}
}
