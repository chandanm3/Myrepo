using Microsoft.EntityFrameworkCore;
namespace Hotelnew.Models
{
    public class HotelContext : DbContext
    {
        public HotelContext(DbContextOptions<HotelContext>options): base(options)
        {

        }
        public DbSet<Hotelm> Hotels { get; set;}
    }
}