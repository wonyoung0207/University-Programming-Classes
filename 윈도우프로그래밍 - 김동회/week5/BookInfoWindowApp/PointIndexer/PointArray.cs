using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PointIndexer
{
    class PointArray
    {
        Point[] p = new Point[10];

        public static int count = 0;
        public Point this[int index]//프로퍼티처럼 동작 , 
            //pointarr객체의 형태가 값을 넣어주는 int v = p.X -> get이 호출,
            // 값을 설정해주는  p.x = 10 형태면 set이 호출,따라서 먼저 set이 호출되고, toString에서 get이 호출된다.  
        {
            get
            {
                return p[index];
            }
            set
            {
                
                p[index] = value;
                //point 객체를 pointarray 인덱서에 넣으면 p객체의 count번째에 값을 넣어주고 카운트 증가
                count++;
            }
        }
    }
}
