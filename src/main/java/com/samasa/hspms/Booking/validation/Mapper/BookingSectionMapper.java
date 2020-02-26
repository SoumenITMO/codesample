package com.samasa.hspms.Booking.validation.Mapper;

import com.samasa.hspms.Booking.validation.Dto.MainInput.BookInputDataDto;
import com.samasa.hspms.Booking.validation.Dto.SubSections.Corta.CortaAccountDto;
import com.samasa.hspms.Booking.validation.Dto.SubSections.RoomBooking.RoomBooking;
import com.samasa.hspms.Booking.validation.Dto.SubSections.RoomType.RoomTypeDto;
import com.samasa.hspms.Booking.validation.Entity.RoomBooking.OcmTrBkgHdr;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BookingSectionMapper {

    CortaAccountDto mappingMainDtoWithCortaAccountDto(BookInputDataDto bookInputDataDto);

    RoomTypeDto mappingMainDtoWithRoomTypeDto(BookInputDataDto bookInputDataDto);

    OcmTrBkgHdr mappingRoomBookingEntitiyToDto(RoomBooking roomBooking);
}
