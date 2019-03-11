using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using Hotel.Models;
using Microsoft.EntityFrameworkCore;

// For more information on enabling Web API for empty projects, visit https://go.microsoft.com/fwlink/?LinkID=397860

namespace Hotel.Controllers
{
    [Route("api/[controller]")]
    [ApiController]
    public class HotelController1 : Controller
    {
        // GET: api/<controller>
        private readonly HotelContext _context;

        public HotelController1(HotelContext context)
        {
            _context = context;

            if (_context.Hotels.Count() == 0)
            {
                // Create a new Hotel item if collection is empty,
                // which means you can't delete all Hotel items.
                _context.Hotels.Add(new Hotelm { Name = "Taj", Address="Delhi", Email="abc@gmail.com", Mobile=9078543345});
                _context.SaveChanges();
            }
        }
        // GET: api/Hotel
[HttpGet]
public async Task<ActionResult<IEnumerable<Hotelm>>> GetHotel()
{
    return await _context.Hotels.ToListAsync();
}

// GET: api/Hotel/1
[HttpGet("{id}")]
public async Task<ActionResult<Hotelm>> GetHotel(long id)
{
    var hotel = await _context.Hotels.FindAsync(id);

    if (hotel == null)
    {
        return NotFound();
    }

    return hotel;
}
        // POST: api/Todo
        [HttpPost]
        public async Task<ActionResult<Hotelm>> PostHotel(Hotelm item)
        {
            _context.Hotels.Add(item);
            await _context.SaveChangesAsync();

            return CreatedAtAction(nameof(GetHotel), new { id = item.Id}, item);
        }

        // PUT: api/Todo/5
        [HttpPut("{id}")]
        public async Task<IActionResult> PutHotel(long id, Hotelm item)
        {
            if (id != item.Id)
            {
                return BadRequest();
            }

            _context.Entry(item).State = EntityState.Modified;
            await _context.SaveChangesAsync();

            return NoContent();
        }

        // DELETE: api/Hotel/5
        [HttpDelete("{id}")]
        public async Task<IActionResult> DeleteHotel(long id)
        {
            var todoItem = await _context.Hotels.FindAsync(id);

            if (todoItem == null)
            {
                return NotFound();
            }

            _context.Hotels.Remove(todoItem);
            await _context.SaveChangesAsync();

            return NoContent();
        }
    }
}
