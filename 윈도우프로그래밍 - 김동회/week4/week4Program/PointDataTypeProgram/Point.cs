using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PointDataTypeProgram
{
    class Point<DataType>
    {
        /*멤버변수, 생성자, 접근자ㅡ 수정자, 
         * get,set 메서드, 연산자, 델리게이트,ToString*/
        private DataType x, y;

        public Point(DataType x, DataType y)//생성자 
        {
            this.x = x;
            this.y = y;
        }

        public void SetX(DataType x)//설정자,C#에서는 첫글자 대문자로 해야함.
        {
            this.x = x;
        }
        public void SetY(DataType y)//11
        {
            this.y = y;
        }
        public DataType GetX(DataType x)
        {
            return x;
        }
        public DataType GetY(DataType y)
        {
            return y;
        }

        /*        public void MoveTo<DataType>(ref DataType x,ref DataType y)
                {
                    this.x = x;
                    this.y = y;

                }*/
        public void MoveTo(DataType x, DataType y)
        {
            this.x = x;
            this.y = y;

        }

        public override string ToString()
        {
            //ToString 메소드는 최상위 객체로부터 상속받는 메소드이기 때문에
            //override 꼭 써줘야 한다. 
            return "X : " + this.x + ", " + " Y : " + this.y;
        }

    }
}
