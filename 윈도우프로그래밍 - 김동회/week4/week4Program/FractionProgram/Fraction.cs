using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FractionProgram
{
    class Fraction
    {
        private int n1, n2, n3, d1, d2, d3;
        private int num_max;
        public Fraction(int n1, int d1, int n2, int d2)//생성자 
        {
            this.n1 = n1;
            this.d1 = d1;
            this.n2 = n2;
            this.d2 = d2;
        }


        public void Tongbun()
        {
            if(this.d1 == this.d2)
            {
                this.d3 = this.d1;
                this.n3 = this.n1 + this.n2;
            }
            else
            {
                this.d3 = this.d1 * this.d2;
                this.n3 = (this.d2 * this.n1) + (this.d1 * this.n2);
            }

        }

        public void Calc()
        {
            Tongbun();
            num_max = Num_Max(this.n3, this.d3);
            this.n3 = this.n3 / num_max;
            this.d3 = this.d3 / num_max;
        }

        public int GetN3()
        {
            return this.n3;
        }

        public int GetD3()
        {
            return this.d3;
        }


        public int Num_Max(int x, int y)//최대공약수 구하는 함수 
        {
            int big, small,temp;

            if(x > y)
            {
                big = x;
                small = y;
            }
            else
            {
                big = y;
                small = x;
            }

            while(small != 0)
            {
                temp = big % small;
                big = small;
                small = temp;
            }

            return big;
        }


    }
}
