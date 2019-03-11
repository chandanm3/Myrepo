using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Hotel.Models;
using Microsoft.EntityFrameworkCore;

namespace Hotel.Models
{
    public class HotelContext:DbContext
    {

        public HotelContext(Microsoft.EntityFrameworkCore.DbContextOptions<HotelContext> options)
           : base(options)
        {
        }

        public Microsoft.EntityFrameworkCore.DbSet<Hotelm> Hotels { get; set; }
    }
}
