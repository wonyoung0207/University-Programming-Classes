using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PointIndexer
{
    public delegate void MyDelegate(int x, int y);//클래스 안이 아니라 같은 네임스페이스 안에 있어야함 
    class Point
    {
        

        private int x, y;
        
        public Point()
        {
            this.x = 0;
            this.y = 0;
        }

        public Point(int x, int y)
        {
            this.x = x;
            this.y = y;

        }

        public int X// 맴버변수 x에 대한 프로퍼티 생성
        {
            get
            {
                return x;
            }
            set
            {
                this.x = value;
            }
        }

        public int Y// 맴버변수 x에 대한 프로퍼티 생성
        {
            get
            {
                return y;
            }
            set
            {
                this.y = value;
            }
        }

        public void MoveTo(int x, int y)
        {
            this.x = x;
            this.y = y;
        }
        public void MoveBy(int moveX, int moveY)
        {
            this.x = this.x + moveX;
            this.y = this.y + moveY;
        }


        public static Point operator +(Point p1, Point p2)
        {
            int x, y;
            x = p1.X + p2.X;//각 객체의 프로퍼티에 접근해서 더해준다.
            y = p1.Y + p2.Y;
            Point pnew = new Point(x, y);

            return pnew;

        }
        public static Point operator -(Point p1, Point p2)
        {
            int x, y;
            x = p1.X - p2.X;//각 객체의 프로퍼티에 접근해서 더해준다.
            y = p1.Y - p2.Y;
            Point pnew = new Point(x, y);

            return pnew;

        }


        public string ToString()
        {
            return "X값 : " + x + " , Y값 : " + y + " 총 저장된 객체 수 : " + PointArray.count;
        }
    }
}
