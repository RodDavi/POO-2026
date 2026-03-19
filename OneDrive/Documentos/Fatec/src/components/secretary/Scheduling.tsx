import React, { useState } from 'react';
import { motion } from 'motion/react';
import { ArrowLeft, Calendar as CalendarIcon, CheckCircle, AlertCircle } from 'lucide-react';
import { Button } from '../ui/button';
import { Input } from '../ui/input';
import { Label } from '../ui/label';
import { Select, SelectContent, SelectItem, SelectTrigger, SelectValue } from '../ui/select';
import { Textarea } from '../ui/textarea';
import { Calendar } from '../ui/calendar';
import { Card } from '../ui/card';
import { toast } from 'sonner@2.0.3';

interface SchedulingProps {
  onBack: () => void;
}

const mockClients = ['João Silva', 'Maria Santos', 'Pedro Oliveira', 'Ana Costa'];
const mockAnimals = ['Rex (Cão)', 'Mimi (Gato)', 'Bob (Cão)', 'Luna (Gato)'];
const mockSpecies = ['Cão', 'Gato', 'Pássaro', 'Coelho'];
const mockVets = ['Dr. João Santos', 'Dra. Maria Silva', 'Dr. Carlos Lima'];

const availableSlots = [
  '08:00', '08:30', '09:00', '09:30', '10:00', '10:30',
  '11:00', '11:30', '14:00', '14:30', '15:00', '15:30',
  '16:00', '16:30', '17:00', '17:30'
];

export default function Scheduling({ onBack }: SchedulingProps) {
  const [date, setDate] = useState<Date | undefined>(new Date());
  const [selectedSlot, setSelectedSlot] = useState<string>('');
  const [formData, setFormData] = useState({
    client: '',
    animal: '',
    species: '',
    vet: '',
    observations: '',
  });
  const [errors, setErrors] = useState<Record<string, boolean>>({});

  const handleSubmit = (e: React.FormEvent) => {
    e.preventDefault();

    const newErrors: Record<string, boolean> = {};
    if (!formData.client) newErrors.client = true;
    if (!formData.animal) newErrors.animal = true;
    if (!formData.species) newErrors.species = true;
    if (!formData.vet) newErrors.vet = true;
    if (!date) newErrors.date = true;
    if (!selectedSlot) newErrors.slot = true;

    if (Object.keys(newErrors).length > 0) {
      setErrors(newErrors);
      toast.error('⚠ Campos obrigatórios não preenchidos');
      return;
    }

    toast.success('✅ Consulta agendada com sucesso!');
    setTimeout(onBack, 1500);
  };

  const handleClear = () => {
    setFormData({
      client: '',
      animal: '',
      species: '',
      vet: '',
      observations: '',
    });
    setDate(new Date());
    setSelectedSlot('');
    setErrors({});
  };

  return (
    <div className="max-w-7xl mx-auto px-4 sm:px-6 lg:px-8 py-8">
      <motion.div
        initial={{ opacity: 0, y: 20 }}
        animate={{ opacity: 1, y: 0 }}
        transition={{ duration: 0.5 }}
      >
        <Button
          variant="ghost"
          onClick={onBack}
          className="mb-6"
        >
          <ArrowLeft size={18} strokeWidth={1.5} className="mr-2" />
          Voltar
        </Button>

        <h1 className="text-3xl text-[#14213D] mb-2">Agendar Consulta</h1>
        <p className="text-gray-600 mb-8">Preencha os dados para criar um novo agendamento</p>

        <div className="grid grid-cols-1 lg:grid-cols-2 gap-8">
          {/* Left column - Form */}
          <Card className="p-6">
            <form onSubmit={handleSubmit} className="space-y-6">
              <div>
                <Label htmlFor="client">Cliente *</Label>
                <Select
                  value={formData.client}
                  onValueChange={(value) => {
                    setFormData({ ...formData, client: value });
                    setErrors({ ...errors, client: false });
                  }}
                >
                  <SelectTrigger className={errors.client ? 'border-red-500' : ''}>
                    <SelectValue placeholder="Selecione o cliente" />
                  </SelectTrigger>
                  <SelectContent>
                    {mockClients.map((client) => (
                      <SelectItem key={client} value={client}>{client}</SelectItem>
                    ))}
                  </SelectContent>
                </Select>
              </div>

              <div>
                <Label htmlFor="animal">Animal *</Label>
                <Select
                  value={formData.animal}
                  onValueChange={(value) => {
                    setFormData({ ...formData, animal: value });
                    setErrors({ ...errors, animal: false });
                  }}
                >
                  <SelectTrigger className={errors.animal ? 'border-red-500' : ''}>
                    <SelectValue placeholder="Selecione o animal" />
                  </SelectTrigger>
                  <SelectContent>
                    {mockAnimals.map((animal) => (
                      <SelectItem key={animal} value={animal}>{animal}</SelectItem>
                    ))}
                  </SelectContent>
                </Select>
              </div>

              <div>
                <Label htmlFor="species">Espécie *</Label>
                <Select
                  value={formData.species}
                  onValueChange={(value) => {
                    setFormData({ ...formData, species: value });
                    setErrors({ ...errors, species: false });
                  }}
                >
                  <SelectTrigger className={errors.species ? 'border-red-500' : ''}>
                    <SelectValue placeholder="Selecione a espécie" />
                  </SelectTrigger>
                  <SelectContent>
                    {mockSpecies.map((species) => (
                      <SelectItem key={species} value={species}>{species}</SelectItem>
                    ))}
                  </SelectContent>
                </Select>
              </div>

              <div>
                <Label htmlFor="vet">Veterinário *</Label>
                <Select
                  value={formData.vet}
                  onValueChange={(value) => {
                    setFormData({ ...formData, vet: value });
                    setErrors({ ...errors, vet: false });
                  }}
                >
                  <SelectTrigger className={errors.vet ? 'border-red-500' : ''}>
                    <SelectValue placeholder="Selecione o veterinário" />
                  </SelectTrigger>
                  <SelectContent>
                    {mockVets.map((vet) => (
                      <SelectItem key={vet} value={vet}>{vet}</SelectItem>
                    ))}
                  </SelectContent>
                </Select>
              </div>

              <div>
                <Label htmlFor="observations">Observações</Label>
                <Textarea
                  id="observations"
                  value={formData.observations}
                  onChange={(e) => setFormData({ ...formData, observations: e.target.value })}
                  placeholder="Informações adicionais sobre a consulta..."
                  rows={4}
                />
              </div>
            </form>
          </Card>

          {/* Right column - Calendar and time slots */}
          <div className="space-y-6">
            <Card className="p-6">
              <div className="flex items-center gap-2 mb-4">
                <CalendarIcon size={20} strokeWidth={1.5} className="text-[#FCA311]" />
                <h3 className="text-[#14213D]">Selecione a data</h3>
              </div>
              <Calendar
                mode="single"
                selected={date}
                onSelect={(newDate) => {
                  setDate(newDate);
                  setErrors({ ...errors, date: false });
                }}
                className="rounded-lg border"
              />
            </Card>

            <Card className="p-6">
              <h3 className="text-[#14213D] mb-4">Horários disponíveis</h3>
              <div className="grid grid-cols-3 gap-2 max-h-64 overflow-y-auto">
                {availableSlots.map((slot) => (
                  <button
                    key={slot}
                    onClick={() => {
                      setSelectedSlot(slot);
                      setErrors({ ...errors, slot: false });
                    }}
                    className={`py-2 px-3 rounded-lg text-sm transition-all ${
                      selectedSlot === slot
                        ? 'bg-[#FCA311] text-[#14213D]'
                        : 'bg-gray-100 text-gray-700 hover:bg-gray-200'
                    }`}
                  >
                    {slot}
                  </button>
                ))}
              </div>
              {errors.slot && (
                <p className="text-red-500 text-sm mt-2 flex items-center gap-1">
                  <AlertCircle size={14} />
                  Selecione um horário
                </p>
              )}
            </Card>
          </div>
        </div>

        {/* Action buttons */}
        <div className="fixed bottom-0 left-0 right-0 bg-white border-t border-gray-200 p-4 shadow-lg">
          <div className="max-w-7xl mx-auto flex justify-end gap-4">
            <Button
              type="button"
              variant="outline"
              onClick={handleClear}
            >
              Limpar
            </Button>
            <Button
              onClick={handleSubmit}
              className="bg-green-600 hover:bg-green-700 text-white"
            >
              <CheckCircle size={18} strokeWidth={1.5} className="mr-2" />
              Salvar
            </Button>
          </div>
        </div>
      </motion.div>
    </div>
  );
}
