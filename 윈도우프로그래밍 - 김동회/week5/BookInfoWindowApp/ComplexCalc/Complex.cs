using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ComplexCalc
{
    class Complex
    {
        private double real,imaginary;

        public Complex(double real, double imaginary)
        {
            this.real = real;
            this.imaginary = imaginary;

        }

        public double Real//real의 프로퍼티
        {
            get
            {
                return real;
            }
            set
            {
                this.real = value;
            }

        }

        public double Imaginary//imaginary의 프로퍼티
        {
            get
            {
                return imaginary;
            }
            set
            {
                this.imaginary = value;
            }

        }

        public static Complex operator +(Complex c1, Complex c2)
        {
            double real, imaginary;

            real = c1.Real + c2.Real;
            imaginary = c1.Imaginary + c2.Imaginary;

            Complex c3 = new Complex(real, imaginary);

            return c3;
        }

        public static Complex operator *(Complex c1, Complex c2)
        {
            double real, imaginary;

            real = (c1.Real * c2.Real) - (c1.Imaginary * c2.Imaginary);
            imaginary = (c1.Imaginary * c2.Real) + (c1.Real * c2.Imaginary);

            Complex c3 = new Complex(real, imaginary);

            return c3;
        }



    }
}
