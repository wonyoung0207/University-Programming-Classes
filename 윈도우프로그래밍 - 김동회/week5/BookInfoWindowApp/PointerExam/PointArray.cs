using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PointerExam
{
    class PointArray//인덱서 연습
    {
        Point[] p = new Point[10];

        public Point getArray(int index)
        {
            return p[index];
        }
        public void setArray(Point p,int index)
        {
            this.p[index] = p;
        }

        //위의 과정(getArray,setArray)을 인덱서의 형태로 손쉽게 만들 수 있다. 
        //인덱서는 이름이 this로 시작하고, 배열 형태이다. 
        public Point this[int index]
        {
            get
            {
                return p[index];
            }
            set
            {
                p[index] = value;
            }
        }
    }
}
